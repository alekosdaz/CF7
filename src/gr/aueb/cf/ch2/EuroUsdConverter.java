package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Diabazei apo ton xrhsth ena poso se Eurw kai
 * Metatrepei Eurw se USD kai cents.
 * H isotimia 99 cents = 1 Eurw
 */
public class EuroUsdConverter {

    public static void main(String[] args) {

        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert an integer amount (Euro)");
        inputEuros = in.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        System.out.printf("%d euros = %d usa dollars , %d usa cents", inputEuros, usaDollars, usaCents);

    }

}
