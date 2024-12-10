package gr.aueb.cf.ch2;

import java.util.Scanner;

public class ScannerAddApp {

    public static void main(String[] args) {

        //Dilwsh kai arxikopoihsh metablgtwn

        int num1 = 0;
        int num2 = 0;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        // Entoles
        System.out.println("Please insert two integers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        sum = num1 + num2;

        //Ektypwsh apotelesmatwn
        System.out.printf("To a8roisma twn %d kai %d einai iso me %d", num1, num2, sum);

    }



}
