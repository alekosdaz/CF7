package gr.aueb.cf.projects.project3;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class project3 {

    public static void main(String[] args) {
        // Πίνακες για χαρακτήρες και συχνότητες
        char[] charArray = new char[128];
        int[] freqArray = new int[128];
        int uniqueCharCount = 0;

        // Διαβάζουμε το αρχείο
        try (FileReader reader = new FileReader(new File("C:/Java/text.txt"))) {
            int c;
            while ((c = reader.read()) != -1) {
                // Αγνοούμε whitespace χαρακτήρες (κενά, αλλαγές γραμμής κ.λπ.)
                if (Character.isWhitespace((char) c)) {
                    continue;
                }

                // Ελέγχουμε αν ο χαρακτήρας είναι λατινικός (κεφαλαία ή πεζά)
                if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                    boolean found = false;

                    for (int i = 0; i < uniqueCharCount; i++) {
                        if (charArray[i] == c) {
                            // Αν βρέθηκε, αυξάνουμε τη συχνότητα
                            freqArray[i]++;
                            found = true;
                            break;
                        }
                    }

                    // Αν δεν βρέθηκε, τον προσθέτουμε στον πίνακα
                    if (!found) {
                        charArray[uniqueCharCount] = (char) c;
                        freqArray[uniqueCharCount] = 1;
                        uniqueCharCount++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Σφάλμα κατά την ανάγνωση του αρχείου: " + e.getMessage());
        }

        // Ταξινόμηση του πίνακα κατά συχνότητα και, αν είναι ίδιες οι συχνότητες, κατά χαρακτήρα
        for (int i = 0; i < uniqueCharCount - 1; i++) {
            for (int j = 0; j < uniqueCharCount - 1 - i; j++) {
                // Αν η συχνότητα του j είναι μικρότερη από τη συχνότητα του j+1, κάνουμε swap
                if (freqArray[j] < freqArray[j + 1]) {
                    // Swap συχνότητας
                    int tempFreq = freqArray[j];
                    freqArray[j] = freqArray[j + 1];
                    freqArray[j + 1] = tempFreq;

                    // Swap χαρακτήρων
                    char tempChar = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = tempChar;
                }
                // Αν οι συχνότητες είναι ίδιες, ταξινομούμε κατά χαρακτήρα
                else if (freqArray[j] == freqArray[j + 1] && charArray[j] > charArray[j + 1]) {
                    // Swap χαρακτήρων
                    char tempChar = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = tempChar;

                    // Swap συχνότητας
                    int tempFreq = freqArray[j];
                    freqArray[j] = freqArray[j + 1];
                    freqArray[j + 1] = tempFreq;
                }
            }
        }

        // Εκτύπωση των χαρακτήρων με τις συχνότητές τους
        System.out.println("Character | Frequency");
        System.out.println("----------------------");

        for (int i = 0; i < uniqueCharCount; i++) {
            // Εκτυπώνουμε τον χαρακτήρα και τη συχνότητα
            System.out.println(charArray[i] + " | " + freqArray[i]);
        }
    }
}
