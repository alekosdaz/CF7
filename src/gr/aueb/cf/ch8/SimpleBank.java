package gr.aueb.cf.ch8;

import java.util.Scanner;

public class SimpleBank {

    static double balance = 500;
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            deposit(100);
        } catch (Exception e){
            System.out.println("An error happened. Try again...");
        }

    }

    public static void deposit(double amount){
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be positive.");
            }
            balance += amount;
            System.out.println("SuccessFully deposited: " + amount);
        }catch (IllegalArgumentException e) {
            System.err.println("Error. " + e.getMessage());
            throw e;
        }
    }
}
