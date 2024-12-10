package gr.aueb.cf.ch8;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionalApp {

    public static void main(String[] args)  {

        File file = new File("C:/tmp/file.txt");
        try {
            test();
        }catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        try (Scanner in = new Scanner(System.in)){
            String name = in.nextLine();
            if (name.equals("Petros")){
                throw new DenGoustarwToOnomaSouException();
            }

        }

        try(AutoKlisimo autoKlisimo = new AutoKlisimo()) {

        } catch (IOException e ){

        }


        try (Scanner in = new Scanner(file)){
            char ch = (char) System.in.read();
            int num = in.nextInt();
        } catch (FileNotFoundException | InputMismatchException e){
            System.err.println("Error. File not found or Input mismatch" + e.getMessage());
            e.printStackTrace();
//            throw e;
        } catch (IOException e){
            System.err.println("IO Exception");
//            throw e;
        } catch (Exception e) {
            System.out.println("Generic error");
            e.printStackTrace();
        }
    }

    public static void test() throws IOException{
// Reading file from path in local directory
        FileReader file = new FileReader("C:/test/a.txt");

        // Creating object as one of ways of taking input
        BufferedReader fileInput = new BufferedReader(file);

        // Printing first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++)
            System.out.println(fileInput.readLine());

        // Closing file connections
        // using close() metho
        fileInput.close();
    }
}
