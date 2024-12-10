package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Dikaioma sthn psifo se hlikies >18
 * Elenxei an mia hlikia exei dikaiwma na psifisei
 */

public class VoteEligible {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int VOTING_AGE = 18;
        boolean isEligible = false;
        int age = 0;

        System.out.println("Enter your age");
        age = scanner.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.println("You are eligible: " + isEligible);
    }
}
