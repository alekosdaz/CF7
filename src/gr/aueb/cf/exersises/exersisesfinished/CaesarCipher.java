package gr.aueb.cf.exersises.exersisesfinished;

public class CaesarCipher {

    public static void main(String[] args) {
        String inputText = "ΓΕΙΑ ΣΟΥ";
        int shift = 3; // Αριθμός θέσεων μετατόπισης (shift)
        String encryptedText = encrypt(inputText, shift);
        System.out.println("Encrypted Text: " + encryptedText);
    }

    // Μέθοδος για κρυπτογράφηση με Κωδικό Καίσαρα
    public static String encrypt(String input, int shift) {
        StringBuilder encryptedString = new StringBuilder();

        // Για κάθε χαρακτήρα στην είσοδο
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Ελέγχουμε αν ο χαρακτήρας είναι ελληνικό γράμμα
            if (currentChar >= 'Α' && currentChar <= 'Ω') { // Κεφαλαία γράμματα
                currentChar = (char) ((currentChar - 'Α' + shift) % 24 + 'Α'); // Μετατόπιση κεφαλαίων
            } else if (currentChar >= 'α' && currentChar <= 'ω') { // Μικρά γράμματα
                currentChar = (char) ((currentChar - 'α' + shift) % 24 + 'α'); // Μετατόπιση μικρών
            }

            encryptedString.append(currentChar);
        }

        return encryptedString.toString();
    }

}
