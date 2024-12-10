package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numenator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            try {

                System.out.println("Please insert a numerator and denominator");
                numenator = in.nextInt();
                if (numenator == 0) break;

                denominator = in.nextInt();
                result = numenator / denominator;

                System.out.printf("%d / %d = %d\n", numenator, denominator, result);
            } catch (ArithmeticException e) {
                System.out.println("Error. Denominator must not be zero");
            }
        }
        System.out.println(" TY for using the app");
    }
}
