package gr.aueb.cf.projects.project1;
import java.io.*;
import java.util.*;

public class project1 {

    public static void main(String[] args) throws IOException {
        // Διαβάζουμε αριθμούς από το αρχείο
        int[] numbers = readNumbersFromFile("C:/Java/input.txt");
        if (numbers.length < 7 || numbers.length > 49) {
            System.out.println("Το αρχείο πρέπει να περιέχει από 7 έως 49 αριθμούς.");
            return;
        }

        // Ταξινόμηση του πίνακα
        Arrays.sort(numbers);

        // Παραγωγή εξάδων και φιλτράρισμα
        int[][] validCombinations = new int[100000][6]; // Προσωρινός μεγάλος πίνακας για αποθήκευση
        int validCount = generateCombinations(numbers, new int[6], 0, 0, validCombinations, 0);

        // Εγγραφή των αποτελεσμάτων στο αρχείο
        writeCombinationsToFile(Arrays.copyOf(validCombinations, validCount), "C:/Java/output.txt");
    }

    private static int[] readNumbersFromFile(String filename) throws IOException {
        int[] numbers = new int[49];
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("[, ]");
                for (String token : tokens) {
                    int number = Integer.parseInt(token);
                    if (number >= 1 && number <= 49) {
                        numbers[count++] = number;
                    }
                }
            }
        }
        return Arrays.copyOf(numbers, count);
    }

    private static int generateCombinations(int[] numbers, int[] combination, int start, int index, int[][] validCombinations, int validCount) {
        if (index == 6) {
            if (isValidCombination(combination)) {
                validCombinations[validCount] = combination.clone();
                validCount++;
            }
            return validCount;
        }

        for (int i = start; i < numbers.length; i++) {
            combination[index] = numbers[i];
            validCount = generateCombinations(numbers, combination, i + 1, index + 1, validCombinations, validCount);
        }
        return validCount;
    }

    private static boolean isValidCombination(int[] combination) {
        return !hasMoreThanFourEvens(combination) &&
                !hasMoreThanFourOdds(combination) &&
                !hasMoreThanTwoContiguous(combination) &&
                !hasMoreThanThreeSameEnding(combination) &&
                !hasMoreThanThreeInSameDecade(combination);
    }

    private static boolean hasMoreThanFourEvens(int[] combination) {
        int evenCount = 0;
        for (int num : combination) {
            if (num % 2 == 0) evenCount++;
        }
        return evenCount > 4;
    }

    private static boolean hasMoreThanFourOdds(int[] combination) {
        int oddCount = 0;
        for (int num : combination) {
            if (num % 2 != 0) oddCount++;
        }
        return oddCount > 4;
    }

    private static boolean hasMoreThanTwoContiguous(int[] combination) {
        for (int i = 0; i < combination.length - 1; i++) {
            if (combination[i + 1] - combination[i] == 1) {
                if (i + 2 < combination.length && combination[i + 2] - combination[i + 1] == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasMoreThanThreeSameEnding(int[] combination) {
        int[] endings = new int[10];
        for (int num : combination) {
            endings[num % 10]++;
        }
        for (int count : endings) {
            if (count > 3) return true;
        }
        return false;
    }

    private static boolean hasMoreThanThreeInSameDecade(int[] combination) {
        int[] decades = new int[5];
        for (int num : combination) {
            decades[num / 10]++;
        }
        for (int count : decades) {
            if (count > 3) return true;
        }
        return false;
    }

    private static void writeCombinationsToFile(int[][] combinations, String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int[] combination : combinations) {
                writer.write(Arrays.toString(combination));
                writer.newLine();
            }
        }
    }
}
