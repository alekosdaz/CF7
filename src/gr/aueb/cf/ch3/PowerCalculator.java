package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ypologizei to base power.
 */
public class PowerCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int i = 0;
        int result = 0;

        System.out.println("Insert base and power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power){
            result *= base;
            i++;
        }
        System.out.println("Result: " + result);
    }
}
