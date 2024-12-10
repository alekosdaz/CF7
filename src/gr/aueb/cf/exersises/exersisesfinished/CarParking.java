package gr.aueb.cf.exersises.exersisesfinished;

import java.util.Arrays;

public class CarParking {

    public static void main(String[] args) {
        // Παράδειγμα πίνακα άφιξης και αναχώρησης αυτοκινήτων
        int[][] arr = {
                {1012, 1136},
                {1317, 1417},
                {1015, 1020}
        };

        // Καλούμε τη μέθοδο για να υπολογίσουμε το μέγιστο αριθμό αυτοκινήτων
        int result = getMaxCarsParked(arr);

        // Εκτύπωση του αποτελέσματος
        System.out.println("Ο μέγιστος αριθμός αυτοκινήτων που είναι σταθμευμένα την ίδια στιγμή είναι: " + result);
    }


    public static int getMaxCarsParked(int[][] arr) {
        // Δημιουργούμε τον πίνακα των γεγονότων
        int n = arr.length;
        int[][] events = new int[2 * n][2];

        // Γεμίζουμε τον πίνακα με τα γεγονότα (άφιξη και αναχώρηση)
        for (int i = 0; i < n; i++) {
            events[2 * i][0] = arr[i][0]; // Ώρα άφιξης
            events[2 * i][1] = 1;         // Άφιξη (1)
            events[2 * i + 1][0] = arr[i][1]; // Ώρα αναχώρησης
            events[2 * i + 1][1] = 0;         // Αναχώρηση (0)
        }

        // Ταξινόμηση των γεγονότων κατά αύξουσα ώρα
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));

        int maxCars = 0;
        int currentCars = 0;

        // Υπολογισμός του μέγιστου αριθμού αυτοκινήτων σταθμευμένων ταυτόχρονα
        for (int i = 0; i < 2 * n; i++) {
            if (events[i][1] == 1) {
                currentCars++; // Άφιξη
            } else {
                currentCars--; // Αναχώρηση
            }
            maxCars = Math.max(maxCars, currentCars); // Ενημερώνουμε τον μέγιστο αριθμό
        }

        return maxCars;
    }
}
