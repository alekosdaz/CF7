package gr.aueb.cf.exersises.exersisesfinished;

import java.util.Scanner;

public class MenuExam2 {

    // Μέθοδος για εμφάνιση του μενού
    public static void printMenu() {
        System.out.println("Επιλέξτε μια από τις παρακάτω επιλογές:");
        System.out.println("1. Επιλογή 1");
        System.out.println("2. Επιλογή 2");
        System.out.println("3. Επιλογή 3");
        System.out.println("4. Επιλογή 4");
        System.out.println("5. Έξοδος");
    }

    // Μέθοδος για ανάγνωση της επιλογής του χρήστη με Scanner
    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Διασφαλίζουμε ότι η επιλογή είναι έγκυρη (1-5)
        while (true) {
            System.out.print("Επιλέξτε μια επιλογή (1-5): ");

            // Ελέγχουμε αν η επόμενη είσοδος είναι ακέραιος αριθμός
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();  // Διαβάζουμε την επιλογή του χρήστη

                // Αν η επιλογή δεν είναι έγκυρη (όχι μεταξύ 1 και 5)
                if (choice < 1 || choice > 5) {
                    // Ρίχνουμε μια IllegalArgumentException
                    throw new IllegalArgumentException("Μη έγκυρη επιλογή. Παρακαλώ επιλέξτε έναν αριθμό από το 1 έως το 5.");
                }
                break;  // Έγκυρη επιλογή, έξοδος από το loop
            } else {
                System.out.println("Παρακαλώ εισάγετε έναν αριθμό.");
                scanner.next();  // Καθαρίζουμε την μη έγκυρη είσοδο
            }
        }

        return choice;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        // Επανάληψη του μενού μέχρι να επιλέξει ο χρήστης την έξοδο
        do {
            printMenu();  // Εμφάνιση του μενού

            try {
                choice = getChoice();  // Ανάγνωση της επιλογής του χρήστη

                // Ανάλογα με την επιλογή του χρήστη, κάνουμε κάτι
                switch (choice) {
                    case 1:
                        System.out.println("Επιλέξατε την επιλογή 1.");
                        break;
                    case 2:
                        System.out.println("Επιλέξατε την επιλογή 2.");
                        break;
                    case 3:
                        System.out.println("Επιλέξατε την επιλογή 3.");
                        break;
                    case 4:
                        System.out.println("Επιλέξατε την επιλογή 4.");
                        break;
                    case 5:
                        System.out.println("Έξοδος από το πρόγραμμα.");
                        break;
                }

            } catch (IllegalArgumentException e) {
                // Διαχείριση της εξαίρεσης και επαναρίξιμο της αν είναι αναγκαίο
                System.out.println(e.getMessage());
                // Μπορούμε να επιλέξουμε να επαναρίξουμε την εξαίρεση αν χρειάζεται:
                // throw e;
            }

        } while (choice != 5);  // Το πρόγραμμα συνεχίζεται μέχρι ο χρήστης να επιλέξει 5 για έξοδο

        scanner.close();
    }
}