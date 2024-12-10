package gr.aueb.cf.exersises.exersisesfinished;

public class CaesarDecipher {

    public static void main(String[] args) {
        String encryptedText = "ΖΘΜΔ Φ\u03A2Ψ"; // Κρυπτογραφημένο κείμενο
        int shift = 3; // Αριθμός θέσεων μετατόπισης (shift)
        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted Text: " + decryptedText);
    }

    // Μέθοδος για αποκρυπτογράφηση με Κωδικό Καίσαρα
    public static String decrypt(String input, int shift) {
        StringBuilder decryptedString = new StringBuilder();

        // Για κάθε χαρακτήρα στην είσοδο
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Ελέγχουμε αν ο χαρακτήρας είναι ελληνικό γράμμα
            if (currentChar >= 'Α' && currentChar <= 'Ω') { // Κεφαλαία γράμματα
                currentChar = (char) ((currentChar - 'Α' - shift + 24) % 24 + 'Α'); // Μετατόπιση κεφαλαίων
            } else if (currentChar >= 'α' && currentChar <= 'ω') { // Μικρά γράμματα
                currentChar = (char) ((currentChar - 'α' - shift + 24) % 24 + 'α'); // Μετατόπιση μικρών
            }

            decryptedString.append(currentChar);
        }

        return decryptedString.toString();
    }

}
