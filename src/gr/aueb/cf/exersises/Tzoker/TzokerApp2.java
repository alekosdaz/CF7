package gr.aueb.cf.exersises.Tzoker;

import java.util.*;

public class TzokerApp2 {
    public static void main(String[] args) {
        // Παράδειγμα τελευταίων 12 κληρώσεων (5 αριθμοί + 1 Τζόκερ)
        int[][] pastDraws = {
                {3, 4, 18, 32, 39, 14},
                {5, 9, 40, 42, 45, 5},
                {4, 20, 31, 42, 45, 8},
                {1, 15, 18, 29, 43, 6},
                {7, 13, 30, 40, 42, 18},
                {23, 24, 29, 35, 40, 18},
                {7, 8, 12, 26, 45, 3},
                {4, 8, 27, 37, 44, 15},
                {14, 26, 35, 38, 45, 14},
                {4, 19, 20, 21, 38, 7},
                {19, 25, 37, 38, 3, 16},
                {28, 31, 35, 38, 42, 8},
                {28, 36, 41, 42, 44, 6}
        };

        // Προβολή των προηγούμενων 12 κληρώσεων
        System.out.println("Προηγούμενες 12 κληρώσεις:");
        for (int[] draw : pastDraws) {
            System.out.println(Arrays.toString(draw));
        }

        // Ανάλυση συχνότητας εμφάνισης αριθμών
        Map<Integer, Integer> frequencyMap = calculateFrequency(pastDraws);
        Map<Integer, Integer> jokerFrequencyMap = calculateFrequencyJoker(pastDraws);

        // Προτεινόμενοι αριθμοί με βάση τη συχνότητα
        System.out.println("\nΠροτεινόμενοι αριθμοί (συχνότεροι):");
        suggestNumbers(frequencyMap,jokerFrequencyMap);

    }

    // Υπολογισμός συχνότητας εμφάνισης αριθμών
    private static Map<Integer, Integer> calculateFrequency(int[][] pastDraws) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Υπολογισμός συχνότητας για τους 5 αριθμούς και τον αριθμό Τζόκερ
        for (int[] draw : pastDraws) {
            for (int i = 0; i < 5; i++) {  // 5 κύριοι αριθμοί
                frequencyMap.put(draw[i], frequencyMap.getOrDefault(draw[i], 0) + 1);
            }

        }

        return frequencyMap;
    }
    private static Map<Integer, Integer> calculateFrequencyJoker(int[][] pastDraws) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Υπολογισμός συχνότητας για τους 5 αριθμούς και τον αριθμό Τζόκερ
        for (int[] draw : pastDraws) {

            frequencyMap.put(draw[5], frequencyMap.getOrDefault(draw[5], 0) + 1);  // Τζόκερ
        }

        return frequencyMap;
    }


    // Προτείνει αριθμούς με βάση τη συχνότητα εμφάνισης
    private static void suggestNumbers(Map<Integer, Integer> frequencyMap, Map<Integer, Integer> jokerFrequencyMap) {
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
        List<Map.Entry<Integer, Integer>> sortedJokerEntries = new ArrayList<>(jokerFrequencyMap.entrySet());

        // Ταξινόμηση της συχνότητας σε φθίνουσα σειρά
        sortedEntries.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());
        sortedJokerEntries.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());


        // Εκτύπωση των πιο συχνών αριθμών για τους κύριους αριθμούς και το Τζόκερ
        System.out.print("Πιο συχνοί αριθμοί: ");
        for (int i = 0; i < 5 && i < sortedEntries.size(); i++) {
            System.out.print(sortedEntries.get(i).getKey() + " ");
        }
        System.out.println();

        // Πρόταση για το Τζόκερ
        System.out.println("Πιο συχνό Τζόκερ: " + sortedJokerEntries.get(0).getKey());
    }
}

