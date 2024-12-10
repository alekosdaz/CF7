package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            if (!isChoiceValid(choice)){
                System.out.println("Error. Choice not valid.");
                continue;
            }

            doOnChoice(choice);

        } while (choice != 5);


    }

    public static void printMenu(){
        System.out.println("Epile3te ena apo ta parakatw:");
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος");
    }

    public static boolean isChoiceValid(int choice){
        return choice >= 1 && choice <=5;
    }

    public static void doOnChoice(int choice){
        switch (choice){
            case 1:
                System.out.println("Eisagwgh process");
                break;
            case 2:
                System.out.println("Diagrafh process");
                break;
            case 3:
                System.out.println("Anazhthsh process");
                break;
            case 4:
                System.out.println("Enhmerwsh process");
                break;
            case 5:
                System.out.println("E3odos");
                break;
            default:
                System.out.println("La8os epilogh");
                break;
        }
    }
}
