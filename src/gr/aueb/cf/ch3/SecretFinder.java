package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Yparxei ena SECRET poy einai integer kai o xrhsths
 * me mia mono prospa8eia 8a prospa8hsei na to brei
 */
public class SecretFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert a num to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET){
            System.out.println("Secret found !!!");
        } else {
            System.out.println("Failed !!!");

        }
    }


}
