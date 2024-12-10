package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Dinei ws output ton pollaplasiasmo enos akeraioy poy
 * dinei o xrhsths me olous tous akeraious apo 1 - 10
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        int i = 0;

        System.out.println("Enter an integer");
        num = scanner.nextInt();

        while (i <= 10){
            //System.out.println(num + " * " + i + " = " + (num * i));
            System.out.printf("%d * %2d = %2d\n", num, i, num * i);
            i++;
        }
    }

}
