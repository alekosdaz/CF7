package gr.aueb.cf.exersises.exersisesfinished;

public class IndexFinder {

    // Main μέθοδος για παράδειγμα χρήσης
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;

        // Καλούμε την getLowAndHighIndexOf για να βρούμε τα low και high indices του key
        int[] indices = getLowAndHighIndexOf(arr, key);

        // Εκτύπωση του αποτελέσματος
        System.out.println("Low index: " + indices[0]);
        System.out.println("High index: " + indices[1]);
    }


    // Μέθοδος για να βρούμε τα low και high indices ενός στοιχείου στον πίνακα
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int lowIndex = -1;
        int highIndex = -1;

        // Αναζήτηση για την πρώτη εμφάνιση του key (low index)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lowIndex = i; // Βρέθηκε το πρώτο key
                break;
            }
        }

        // Αν δεν βρούμε το στοιχείο, επιστρέφουμε έναν πίνακα με -1 για αμφότερα τα indices
        if (lowIndex == -1) {
            return new int[]{-1, -1};
        }

        // Αναζήτηση για την τελευταία εμφάνιση του key (high index)
        for (int i = lowIndex; i < arr.length; i++) {
            if (arr[i] == key) {
                highIndex = i; // Ενημέρωση της θέσης του τελευταίου key
            } else {
                break; // Όταν δεν βρίσκουμε πια το key, σταματάμε
            }
        }

        // Επιστρέφουμε έναν πίνακα με τα indices
        return new int[]{lowIndex, highIndex};
    }

}
