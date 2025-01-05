package gr.aueb.cf.projects.project5;
import java.util.Scanner;
public class project5 {

    public static void main(String[] args) {
        project5 theatre = new project5();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nΕπιλογές:");
            System.out.println("1. Κράτηση θέσης");
            System.out.println("2. Ακύρωση κράτησης");
            System.out.println("3. Εμφάνιση θέσεων");
            System.out.println("4. Έξοδος");
            System.out.print("Επιλέξτε μία ενέργεια (1/2/3/4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Καθαρισμός του buffer του scanner

            if (choice == 1) {
                // Κράτηση θέσης
                System.out.print("Εισάγετε τη στήλη (A-L): ");
                char column = scanner.nextLine().charAt(0);
                System.out.print("Εισάγετε τη σειρά (1-30): ");
                int row = scanner.nextInt();
                scanner.nextLine(); // Καθαρισμός του buffer
                theatre.book(column, row);

            } else if (choice == 2) {
                // Ακύρωση κράτησης
                System.out.print("Εισάγετε τη στήλη (A-L): ");
                char column = scanner.nextLine().charAt(0);
                System.out.print("Εισάγετε τη σειρά (1-30): ");
                int row = scanner.nextInt();
                scanner.nextLine(); // Καθαρισμός του buffer
                theatre.cancel(column, row);

            } else if (choice == 3) {
                // Εμφάνιση των θέσεων
                theatre.showSeats();

            } else if (choice == 4) {
                // Έξοδος
                System.out.println("Έξοδος από το πρόγραμμα.");
                break;

            } else {
                System.out.println("Μη έγκυρη επιλογή. Προσπαθήστε ξανά.");
            }
        }

        scanner.close();
    }
    // Δημιουργία του πίνακα του θεάτρου: 30 σειρές και 12 στήλες
    private boolean[][] seats = new boolean[30][12];

    // Μέθοδος για να κρατήσουμε μία θέση
    public void book(char column, int row) {
        // Μετατροπή της στήλης σε δείκτη (0-11 για 12 στήλες)
        int col = column - 'A'; // Η στήλη A είναι η 0, η Β είναι η 1, κ.ο.κ.

        // Έλεγχος αν η θέση είναι ήδη κρατημένη
        if (seats[row - 1][col]) {
            System.out.println("Η θέση " + column + row + " είναι ήδη κρατημένη.");
        } else {
            seats[row - 1][col] = true; // Κράτηση της θέσης
            System.out.println("Η θέση " + column + row + " κρατήθηκε επιτυχώς.");
        }
    }

    // Μέθοδος για να ακυρώσουμε μία κράτηση
    public void cancel(char column, int row) {
        // Μετατροπή της στήλης σε δείκτη (0-11 για 12 στήλες)
        int col = column - 'A';

        // Έλεγχος αν η θέση είναι ήδη ελεύθερη
        if (!seats[row - 1][col]) {
            System.out.println("Η θέση " + column + row + " δεν είναι κρατημένη.");
        } else {
            seats[row - 1][col] = false; // Ακύρωση της κράτησης
            System.out.println("Η κράτηση για τη θέση " + column + row + " ακυρώθηκε επιτυχώς.");
        }
    }

    // Μέθοδος για να εμφανίσουμε την κατάσταση των θέσεων (κράτηση ή όχι)
    public void showSeats() {
        System.out.println("Κατάσταση Θέσεων:");
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 12; j++) {
                if (seats[i][j]) {
                    System.out.print("[X] "); // Κρατημένη θέση
                } else {
                    System.out.print("[ ] "); // Ελεύθερη θέση
                }
            }
            System.out.println();
        }
    }
}
