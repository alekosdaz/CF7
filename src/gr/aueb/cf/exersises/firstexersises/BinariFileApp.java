package gr.aueb.cf.exersises.firstexersises;

import java.io.*;
import java.nio.file.*;
import java.util.UUID;

public class BinariFileApp {
    public static void main(String[] args) {
        // Προκαθορισμένος φάκελος
        String inFolderPath = "C:/tmp/";
        String outFolderPath = "C:/tmp/";

        // Ζητάμε το όνομα του αρχείου από τον χρήστη
        System.out.println("Εισάγετε το όνομα του αρχείου για αντιγραφή: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String userInputFile = reader.readLine();

            // Ορίζουμε τις διαδρομές των αρχείων
            Path inputFilePath = Paths.get(inFolderPath + userInputFile);
            String outputFileName = UUID.randomUUID().toString().replace(":", "_") + userInputFile;
            Path outputFilePath = Paths.get(outFolderPath + outputFileName);

            // Αντιγραφή του αρχείου
            copyFile(inputFilePath, outputFilePath);

            // Εμφάνιση των ζητούμενων metadata
            System.out.println("Πλήρες όνομα αρχικού αρχείου: " + inputFilePath.toAbsolutePath());
            System.out.println("Πλήρες όνομα αποθηκευμένου αρχείου: " + outputFilePath.toAbsolutePath());
            System.out.println("Επέκταση αρχείου: " + getFileExtension(userInputFile));

        } catch (IOException e) {
            System.err.println("Σφάλμα: " + e.getMessage());
        }
    }

    // Μέθοδος αντιγραφής του αρχείου
    private static void copyFile(Path source, Path destination) throws IOException {
        try (InputStream in = new BufferedInputStream(Files.newInputStream(source));
             OutputStream out = new BufferedOutputStream(Files.newOutputStream(destination))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("Η αντιγραφή ολοκληρώθηκε με επιτυχία.");
        }
    }

    // Μέθοδος για απόκτηση της επέκτασης αρχείου
    private static String getFileExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf(".");
        return (lastDotIndex == -1) ? "" : fileName.substring(lastDotIndex + 1);
    }
}