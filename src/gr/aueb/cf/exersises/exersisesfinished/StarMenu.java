package gr.aueb.cf.exersises.exersisesfinished;

import java.util.Scanner;

public class StarMenu {


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

        } while (choice != 6);
    }

    public static void printMenu(){
        System.out.println("Epile3te mia apo tis parakatw diergasies:");
        System.out.println("1. Αστεράκια οριζόντια");
        System.out.println("2. Αστεράκια κάθετα");
        System.out.println("3. Γραμμές με n αστεράκια");
        System.out.println("4. Γραμμές με αστεράκια 1 έως n");
        System.out.println("5. Γραμμές με αστεράκια n έως 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static boolean isChoiceValid(int choice){
        return choice >= 1 && choice <=6;
    }

    public static void doOnChoice(int choice){
        Scanner scanner = new Scanner(System.in);
        switch (choice){
            case 1:
                System.out.println("Dwse ari8mo asteriwn");
                int starshor = scanner.nextInt();
                hor(starshor);
                System.out.println("");
                break;
            case 2:
                System.out.println("Dwse ari8mo asteriwn");
                int starsver = scanner.nextInt();
                ver(starsver);
                System.out.println("");
                break;
            case 3:
                System.out.println("Dwse ari8mo asteriwn");
                int starshorver = scanner.nextInt();
                int i = 1;
                while(starshorver >= i){
                    hor(starshorver);
                    System.out.println("");
                    i++;
                }
                System.out.println("");
                break;
            case 4:
                System.out.println("Dwse ari8mo asteriwn");
                int starshorvert = scanner.nextInt();
                int n = 1;
                while(starshorvert >= n){
                    hor(n);
                    System.out.println("");
                    n++;
                }
                System.out.println("");
                break;
            case 5:
                System.out.println("Dwse ari8mo asteriwn");
                int starshorverm = scanner.nextInt();
                int y = starshorverm;
                while(starshorverm >= y && y > 0){
                    hor(y);
                    System.out.println("");
                    y--;
                }
                System.out.println("");
                break;
            case 6:
                System.out.println("E3odos");
                break;
            default:
                System.out.println("La8os epilogh");
                break;
        }
    }

    public static void hor(int stars) {
        int run = 1;

        while (stars >= run) {
            System.out.print("*");
            run++;
        }
    }
    public static void ver(int stars){
        int run = 1;
        while (stars >= run){
             System.out.println("*");
             run++;
        }


    }
}
