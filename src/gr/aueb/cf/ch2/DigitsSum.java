package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Na lambanei ws input apo ton xrhsth ena dipshfio akeraio kai
 * upologizei kai na ektypwnei to ar8roisma twn pshfiwn toy
 * Gia paradeigma an o xrhsths dwsei ton akeraio 15 , 8a
 * prepei to apotelesma na einai 1+5=6
 */
public class DigitsSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNum;
        int sum = 0;

        System.out.println("Please insert a two-digit integer");
        inputNum = in.nextInt();

        leftDigit = inputNum / 10; //Me div 10 pairnoume to aristero pshfio
        rightDigit = inputNum % 10; //Me mod 10 pairnoume to de3i pshfio
        sum = leftDigit + rightDigit;

        System.out.printf("Input num: %d, Left digit: %d, Right digit: %d, Sum: %d",inputNum, leftDigit, rightDigit, sum);


    }
}
