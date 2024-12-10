package gr.aueb.cf.exersises.firstexersises;
import java.lang.Math;
import java.util.Scanner;
public class findMax {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input 3 integers: ");
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        int z = keyboard.nextInt();
        int max = Math.max(x,y);

        if(max>y){ //suppose x is max then compare x with z to find max number
            max = Math.max(x,z);
        }
        else{ //if y is max then compare y with z to find max number
            max = Math.max(y,z);
        }
        System.out.println("The max of three is: " + max);

    }




}
