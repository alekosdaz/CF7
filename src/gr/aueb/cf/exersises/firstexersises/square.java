package gr.aueb.cf.exersises.firstexersises;

import java.util.Scanner;

public class square {

    public static void main(String[] args) {
        System.out.println("Dwse ena ari8mo :");
        Scanner scanner = new Scanner(System.in);
        int square = 0;
        square = scanner.nextInt();
        System.out.println("To tetragwno tou "+ square + " einai : " + squareCal(square));
    }
    public static int squareCal (int square){
        return square * square;
    }

}
