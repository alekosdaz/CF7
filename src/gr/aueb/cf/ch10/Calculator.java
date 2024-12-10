package gr.aueb.cf.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        try {
            System.out.print("Parakalw eisagete dyo akeraioys");
            //DATA binding
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            result = div(num1, num2);

            System.out.println("Sum : " + result);
        } catch (InputMismatchException e) {
            System.out.println("H eisodos prepei na einai akeraioi");
        } catch (Exception e) {
            System.out.println("La8os kata ton ypologismo. Den mporei na ginei diairesh me to mhden");
        }

    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) throws Exception {
        try {
            if (b == 0) throw new Exception("Error. Denominator not zero");
            return a / b;
        } catch (Exception e) {
            System.err.println("Error, " + e.getMessage());
            throw e;
        }
    }
}
