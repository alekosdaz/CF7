package gr.aueb.cf.ch2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * Calculate the price with vat.
 */
public class PriceWithVat {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double inputprice = 0.0;
        final double VAT_RATE = 0.24;
        double priceWithVat = 0.0;
        double vat = 0.0;

        System.out.println("Please insert the price: ");
        inputprice = in.nextDouble();
        vat = inputprice * VAT_RATE;
        priceWithVat = inputprice + vat;

        System.out.printf("Price : %.2f, Vat: %.2f, Price with vat: %.2f", inputprice, vat, priceWithVat);


    }

}
