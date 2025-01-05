package gr.aueb.cf.projects.project3;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class project3 {

    public static void main(String[] args) {

        char[] charArray = new char[128];
        int[] freqArray = new int[128];
        int uniqueCharCount = 0;


        try (FileReader reader = new FileReader(new File("C:/Java/text.txt"))) {
            int c;
            while ((c = reader.read()) != -1) {

                if (Character.isWhitespace((char) c)) {
                    continue;
                }


                if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
                    boolean found = false;

                    for (int i = 0; i < uniqueCharCount; i++) {
                        if (charArray[i] == c) {

                            freqArray[i]++;
                            found = true;
                            break;
                        }
                    }


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


        for (int i = 0; i < uniqueCharCount - 1; i++) {
            for (int j = 0; j < uniqueCharCount - 1 - i; j++) {

                if (freqArray[j] < freqArray[j + 1]) {

                    int tempFreq = freqArray[j];
                    freqArray[j] = freqArray[j + 1];
                    freqArray[j + 1] = tempFreq;


                    char tempChar = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = tempChar;
                }

                else if (freqArray[j] == freqArray[j + 1] && charArray[j] > charArray[j + 1]) {

                    char tempChar = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = tempChar;


                    int tempFreq = freqArray[j];
                    freqArray[j] = freqArray[j + 1];
                    freqArray[j + 1] = tempFreq;
                }
            }
        }

        System.out.println("Character | Frequency");
        System.out.println("----------------------");

        for (int i = 0; i < uniqueCharCount; i++) {

            System.out.println(charArray[i] + " | " + freqArray[i]);
        }
    }
}
