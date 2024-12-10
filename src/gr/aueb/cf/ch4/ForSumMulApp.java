package gr.aueb.cf.ch4;

/**
 * Calculate sum and mul of the 10 first integers.
 */
public class ForSumMulApp {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;

        for (int i = 1; i <= 10; i++){
            sum += i;
            mul *= i;
        }

        System.out.println("Sum : " + sum);
        System.out.println("Mul : " + mul);
    }
}
