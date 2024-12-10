package gr.aueb.cf.exersises.exersisesfinished;

public class Encryption {

    public static void main(String[] args) {
        String inputText = "Hello, World!";
        String encryptedText = encrypt(inputText);
        System.out.println("Encrypted Text: " + encryptedText);
    }


    // Μέθοδος για κρυπτογράφηση
    public static String encrypt(String input) {
        StringBuilder encryptedString = new StringBuilder();

        // Για κάθε χαρακτήρα στην είσοδο
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char encryptedChar = (char) (currentChar + 1); // Προσθέτουμε 1 στην τιμή του ASCII
            encryptedString.append(encryptedChar);
        }

        return encryptedString.toString();
    }

}
