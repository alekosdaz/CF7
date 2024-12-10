package gr.aueb.cf.exersises.exersisesfinished;

import java.util.Scanner;

public class LotteryFilter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ζητάμε από τον χρήστη να εισάγει 6 ακέραιους αριθμούς
        int[] numbers = new int[6];
        System.out.println("Εισάγετε 6 ακέραιους αριθμούς από το 1 έως το 49:");
        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.print("Αριθμός " + (i + 1) + ": ");
                int num = scanner.nextInt();
                if (num >= 1 && num <= 49) {
                    numbers[i] = num;
                    break;
                } else {
                    System.out.println("Ο αριθμός πρέπει να είναι μεταξύ 1 και 49. Προσπαθήστε ξανά.");
                }
            }
        }

        // Έλεγχοι
        boolean valid = true;

        // Ελέγχουμε κάθε φίλτρο και εκτυπώνουμε τα αποτελέσματα
        if (hasMoreThanThreeEvens(numbers)) {
            System.out.println("Περιέχει πάνω από 3 άρτιους αριθμούς.");
            valid = false;
        }
        if (hasMoreThanThreeOdds(numbers)) {
            System.out.println("Περιέχει πάνω από 3 περιττούς αριθμούς.");
            valid = false;
        }
        if (hasMoreThanThreeConsecutive(numbers)) {
            System.out.println("Περιέχει πάνω από 3 συνεχόμενους αριθμούς.");
            valid = false;
        }
        if (hasMoreThanThreeWithSameLastDigit(numbers)) {
            System.out.println("Περιέχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα.");
            valid = false;
        }
        if (hasMoreThanThreeInSameDecade(numbers)) {
            System.out.println("Περιέχει πάνω από 3 αριθμούς στην ίδια δεκάδα.");
            valid = false;
        }

        if (valid) {
            System.out.println("Η εξάδα είναι έγκυρη.");
        } else {
            System.out.println("Η εξάδα δεν πληροί τα κριτήρια.");
        }

        scanner.close();
    }

    // Μέθοδος για έλεγχο άρτιων αριθμών
    public static boolean hasMoreThanThreeEvens(int[] numbers) {
        int evenCount = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount > 3; // Επιστρέφει true αν υπάρχουν περισσότεροι από 3 άρτιοι
    }

    // Μέθοδος για έλεγχο περιττών αριθμών
    public static boolean hasMoreThanThreeOdds(int[] numbers) {
        int oddCount = 0;
        for (int num : numbers) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount > 3; // Επιστρέφει true αν υπάρχουν περισσότεροι από 3 περιττοί
    }

    // Μέθοδος για έλεγχο συνεχόμενων αριθμών
    public static boolean hasMoreThanThreeConsecutive(int[] numbers) {
        int consecutiveCount = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] + 1 == numbers[i + 1]) {
                consecutiveCount++;
            }
        }
        return consecutiveCount > 2; // Επιστρέφει true αν υπάρχουν περισσότεροι από 3 συνεχόμενοι
    }

    // Μέθοδος για έλεγχο αριθμών με τον ίδιο λήγοντα
    public static boolean hasMoreThanThreeWithSameLastDigit(int[] numbers) {
        int[] lastDigitCount = new int[10]; // Για την αποθήκευση των ληγόντων 0-9
        for (int num : numbers) {
            int lastDigit = num % 10;
            lastDigitCount[lastDigit]++;
        }

        for (int count : lastDigitCount) {
            if (count > 3) {
                return true; // Επιστρέφει true αν υπάρχει αριθμός με τον ίδιο λήγοντα πάνω από 3 φορές
            }
        }
        return false;
    }

    // Μέθοδος για έλεγχο αριθμών στην ίδια δεκάδα
    public static boolean hasMoreThanThreeInSameDecade(int[] numbers) {
        int[] decadeCount = new int[5]; // Για δεκάδες 1-10, 11-20, ..., 41-49
        for (int num : numbers) {
            int decadeIndex = (num - 1) / 10;
            decadeCount[decadeIndex]++;
        }

        for (int count : decadeCount) {
            if (count > 3) {
                return true; // Επιστρέφει true αν υπάρχουν περισσότεροι από 3 αριθμοί στην ίδια δεκάδα
            }
        }
        return false;
    }

}
