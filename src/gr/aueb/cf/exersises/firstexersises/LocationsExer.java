package gr.aueb.cf.exersises.firstexersises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Diabazei apo ena arxeio dedomena
 *
 */

public class LocationsExer {

    public static void main(String[] args) {
        String inFilePath = "C:/Java/locations.txt";
        String outFilePath = "C:/Java/locations-formated.txt";
        String line;
        String[] tokens;

        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
             PrintStream ps = new PrintStream(outFilePath, StandardCharsets.UTF_8)) {

            reader.readLine();

            while ((line = reader.readLine()) != null) {
                tokens = line.split(",+\\s*");
//                ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" },\n", tokens[0], tokens[1], tokens[2]);
                printFormatted(ps, tokens);
                printFormatted(System.out, tokens);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void printFormatted(PrintStream ps, String[] tokens) {
        ps.printf("{ \"location\": \"%s\", \"latitude\": \"%s\", \"longitude\": \"%s\" },\n", tokens[0], tokens[1], tokens[2]);
    }
}