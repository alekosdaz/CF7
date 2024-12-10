package gr.aueb.cf.exersises.exersisesfinished;

import java.util.Scanner;

public class StarsWarsExer {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n;

        int i = 1;
        int x = 1;
        int y = 1;
        n = scanner.nextInt();
        while (i <= n) {
            System.out.print("*");
            i++;
        }
        System.out.println(" ");
        while (n >= 1){
            System.out.println("*");
            n--;
        }
        n = scanner.nextInt();
        int mul= n * n;
        System.out.println(n + " x " + n + " = " + mul);

        n = scanner.nextInt();
        while (x <= n) {

            System.out.print(x);
            x++;
        }
        System.out.println("");
        n = scanner.nextInt();
        while (n >= y) {

            System.out.print(n);
            n--;
        }
    }

}
