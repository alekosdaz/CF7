package gr.aueb.cf.exersises.exersisesfinished;

public class Decryption {

    public static void main(String[] args) {
        String encryptedText = "Ifmmp-!Xpsme\"";  // Κρυπτογραφημένο κείμενο
        String decryptedText = decrypt(encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);
    }

    // Μέθοδος για αποκρυπτογράφηση
    public static String decrypt(String input) {
        StringBuilder decryptedString = new StringBuilder();

        // Για κάθε χαρακτήρα στην είσοδο
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char decryptedChar = (char) (currentChar - 1); // Αφαιρούμε 1 από την τιμή του ASCII
            decryptedString.append(decryptedChar);
        }

        return decryptedString.toString();
    }
}
