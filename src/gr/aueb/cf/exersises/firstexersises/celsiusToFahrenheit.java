package gr.aueb.cf.exersises.firstexersises;

import java.util.Scanner;

public class celsiusToFahrenheit {

    public static void main(String[] args) {
        System.out.println("Dwse th 8ermokrasia se Celsius pou 8es na metatrepseis : ");
        Scanner scanner = new Scanner(System.in);
        double tempCels = scanner.nextDouble();

//        celsToFahr(tempCels);;
        System.out.println("H 8ermokkrasia einai : " + celsToFahr(tempCels));
    }

    public static double celsToFahr(double cels ){
        return ((cels*9)/5)+32;

    }

}
