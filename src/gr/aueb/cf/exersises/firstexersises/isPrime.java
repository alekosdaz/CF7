package gr.aueb.cf.exersises.firstexersises;
import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        if(isPrime(number)) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is a non-prime number");
        }
    }


    public  static  boolean isPrime(int num)
    {
        if(num <= 1)
        {
            return false;
        }
        for(int i = 2; i <= num / 2; i++)
        {
            if((num % i) == 0)
                return  false;
        }
        return true;
    }
}
