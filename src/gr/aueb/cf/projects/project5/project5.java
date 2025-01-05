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
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Εισάγετε τη στήλη (A-L): ");
                char column = scanner.nextLine().charAt(0);
                System.out.print("Εισάγετε τη σειρά (1-30): ");
                int row = scanner.nextInt();
                scanner.nextLine();
                theatre.book(column, row);

            } else if (choice == 2) {

                System.out.print("Εισάγετε τη στήλη (A-L): ");
                char column = scanner.nextLine().charAt(0);
                System.out.print("Εισάγετε τη σειρά (1-30): ");
                int row = scanner.nextInt();
                scanner.nextLine();
                theatre.cancel(column, row);

            } else if (choice == 3) {

                theatre.showSeats();

            } else if (choice == 4) {

                System.out.println("Έξοδος από το πρόγραμμα.");
                break;

            } else {
                System.out.println("Μη έγκυρη επιλογή. Προσπαθήστε ξανά.");
            }
        }

        scanner.close();
    }

    private boolean[][] seats = new boolean[30][12];


    public void book(char column, int row) {

        int col = column - 'A';


        if (seats[row - 1][col]) {
            System.out.println("Η θέση " + column + row + " είναι ήδη κρατημένη.");
        } else {
            seats[row - 1][col] = true;
            System.out.println("Η θέση " + column + row + " κρατήθηκε επιτυχώς.");
        }
    }


    public void cancel(char column, int row) {

        int col = column - 'A';


        if (!seats[row - 1][col]) {
            System.out.println("Η θέση " + column + row + " δεν είναι κρατημένη.");
        } else {
            seats[row - 1][col] = false;
            System.out.println("Η κράτηση για τη θέση " + column + row + " ακυρώθηκε επιτυχώς.");
        }
    }


    public void showSeats() {
        System.out.println("Κατάσταση Θέσεων:");
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 12; j++) {
                if (seats[i][j]) {
                    System.out.print("[X] ");
                } else {
                    System.out.print("[ ] ");
                }
            }
            System.out.println();
        }
    }
}
