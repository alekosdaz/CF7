package gr.aueb.cf.exersises.exersisesfinished;

public class ArrayOperations {

    public static void main(String[] args) {
        int[] array = {1, -2, 3, 4, -5, 6};

        ArrayOperations operations = new ArrayOperations();

        // Αναζήτηση του στοιχείου 3 στον πίνακα
        int index = operations.searchElement(array, 3);
        System.out.println("Η θέση του 3 είναι: " + index);

        // Εκτύπωση των ζυγών αριθμών
        System.out.println("Ζυγές τιμές:");
        operations.printEvenNumbers(array);

        // Δημιουργία πίνακα με τα διπλάσια των στοιχείων
        int[] doubled = operations.doubleElements(array);
        System.out.println("Διπλάσια των στοιχείων:");
        for (int num : doubled) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Έλεγχος για θετικό αριθμό
        boolean hasPositive = operations.hasPositiveNumber(array);
        System.out.println("Υπάρχει θετικός αριθμός: " + hasPositive);

        // Έλεγχος αν όλα τα στοιχεία είναι θετικά
        boolean allPositive = operations.areAllPositive(array);
        System.out.println("Όλα τα στοιχεία είναι θετικά: " + allPositive);
    }

    public int searchElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Επιστρέφει τη θέση του στοιχείου
            }
        }
        return -1; // Αν δεν βρει το στοιχείο
    }

    public void printEvenNumbers(int[] array) {
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.println(num); // Εκτύπωση του ζυγού στοιχείου
            }
        }
    }

    public int[] doubleElements(int[] array) {
        int[] doubledArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            doubledArray[i] = array[i] * 2; // Διπλασιασμός του στοιχείου
        }
        return doubledArray;
    }

    public boolean hasPositiveNumber(int[] array) {
        for (int num : array) {
            if (num > 0) {
                return true; // Βρέθηκε τουλάχιστον ένα θετικό στοιχείο
            }
        }
        return false; // Αν δεν υπάρχει κανένα θετικό στοιχείο
    }

    public boolean areAllPositive(int[] array) {
        for (int num : array) {
            if (num <= 0) {
                return false; // Βρέθηκε τουλάχιστον ένα μη θετικό στοιχείο
            }
        }
        return true; // Όλα τα στοιχεία είναι θετικά
    }
}
