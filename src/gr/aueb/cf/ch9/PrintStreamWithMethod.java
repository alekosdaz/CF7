package gr.aueb.cf.ch9;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {

    public static void main(String[] args) {

//        try (PrintStream ps = new PrintStream("C:/Java/cf7.txt", StandardCharsets.UTF_8)){
        try (PrintStream ps = new PrintStream(new FileOutputStream("C:/Java/cf7.txt", true), true, StandardCharsets.UTF_8)){

            printMessage(ps, "Hello Coding Factory");
            printMessage(System.out, "Hello CF !");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Generic PrintStream Method
     * @param ps
     * @param message
     */

    public static void printMessage(PrintStream ps, String message){
        ps.println(message);
    }
}
