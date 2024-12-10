package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choise;

        do{
            System.out.println("Epile3te ena apo ta parakatw:");
            System.out.println("1. One player game");
            System.out.println("2. Two player game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");

            choise = scanner.nextInt();
//            if (choise < 1 || choise > 4){
//                System.out.println("Choise must be between 1-4");
//                System.out.println("Try again");
//                continue;
//            }
//
//            if (choise == 1){
//                System.out.println("One player game started");
//            } else if (choise == 2) {
//                System.out.println("Two player game started");
//            }  else if (choise == 3) {
//                System.out.println("Team game started");
//            } else {
//                System.out.println("Quiting...");
//            }
            switch (choise){
                case 1:
                    System.out.println("One-player game started");
                    break;
                case 2:
                    System.out.println("Two-player game started");
                    break;
                case 3:
                    System.out.println("Team game started");
                    break;
                case 4:
                    System.out.println("Quiting...");
                    break;
                default:
                    System.out.println("Error in choice");
                    break;

            }
        } while (choise != 4);

    }
}
