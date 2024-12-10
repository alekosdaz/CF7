package gr.aueb.cf.ch5;

import java.util.Scanner;

public class AddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;
        int sub = 0;

        System.out.println("Enter two integers");
        a = scanner.nextInt();
        b = scanner.nextInt();

        sum = add(a, b);
        sub = sub(a, b);
//        sub = AddApp.sub(a, b);

        System.out.println(sum);
        System.out.println(sub);

    }

    public static int add(int a, int b){
//        int result = 0;
//        result = a + b;
//        return result;
//        //
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }
}
