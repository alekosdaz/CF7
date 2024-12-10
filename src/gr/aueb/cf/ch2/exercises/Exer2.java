package gr.aueb.cf.ch2.exercises;

import java.util.Scanner;

public class Exer2 {

    public static void main(String[] args) {

        int day;
        int month;
        int year;
        Scanner date = new Scanner(System.in);
        Scanner months = new Scanner(System.in);
        Scanner years = new Scanner(System.in);

        System.out.println("Dwse thn hmera :");
        day = date.nextInt();
        System.out.println("Dwse to mhna :");
        month = months.nextInt();
        System.out.println("Dwse th xronia :");
        year = years.nextInt();

        System.out.printf("H hmeromhnia pou edwses einai : %02d/%02d/%04d",day, month, year);
    }
}
