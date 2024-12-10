package gr.aueb.cf.exersises.exersisesfinished;

import java.util.Scanner;

public class exersiseMenu {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (true) {


            System.out.println("Please select one of the following: ");
            System.out.println("1. Εισαγωγή");
            System.out.println("2. Διαγραφή");
            System.out.println("3. Ενημέρωση");
            System.out.println("4. Αναζήτηση");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();

            if (choice != 5) {

                if (choice == 1) {
                    System.out.println("Επιλέξατε Εισαγωγή");
                    continue;
                } else if (choice == 2) {
                    System.out.println("Επιλέξατε Διαγραφή");
                    continue;
                } else if (choice == 3) {
                    System.out.println("Επιλέξατε Ενημέρωση");
                    continue;
                } else if (choice == 4) {
                    System.out.println("Επιλέξατε Αναζήτηση");
                    continue;
                }
                System.out.println("Wrong number");


            } else {
                System.out.println("Επιλέξατε Έξοδος");
                break;
            }
        }


    }
}
