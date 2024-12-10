package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Lamvanei mia 8ermokrasia apo to xrhsth
 * kai emfanizei to analogo mhnuma.
 */
public class tempApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp =0;
        boolean isTempBeLowZero;

        System.out.println("Please insert the current temperature");
        temp = in.nextInt();

        isTempBeLowZero = temp < 0;
        System.out.println("Temperature is below zero: " + isTempBeLowZero);

    }
}
