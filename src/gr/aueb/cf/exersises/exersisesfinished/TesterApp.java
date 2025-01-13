package gr.aueb.cf.exersises.exersisesfinished;

import java.util.Scanner;

public class TesterApp {

    public static void main(String[] args) {

        int x = 1;
        int n = 1;
        int i = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pes posa asteria 8es orizontia : ");
        orizAstra(n = scanner.nextInt());

        System.out.println("Pes posa asteria 8es ka8eta : ");
        ka8etaAstra(n = scanner.nextInt());

        System.out.println("Pes posa asteria na polaplasiasw : ");
        nprosn(n = scanner.nextInt());

    }

    public static void orizAstra(int n){
        int i = 1;

        while (i <= n){
            System.out.print("*");
            i++;
        }
        System.out.println(" ");
        System.out.println(n + " asteria orizontia zhthses");
    }

    public static void ka8etaAstra(int n){
        int temp = n;
        while (n >= 1) {
            System.out.println("*");
            n--;
        }
        System.out.println(temp + " asteria ka8eta zhthses");
    }



    public static void nprosn(int n){
        int mul = n * n;
        System.out.println(n + " * " + n +" = "+ mul);
    }

}
