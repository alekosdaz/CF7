package gr.aueb.cf.exersises.Tzoker;

import java.util.*;


public class TzokerApp {
    public static void main(String[] args) {
        Random rand = new Random();

        // Δημιουργία 10 κληρώσεων από 5 αριθμούς (1-45) και έναν αριθμό Τζόκερ (1-20)
        List<int[]> pastDraws = generatePastDraws(rand);

        // Προβολή των προηγούμενων 10 κληρώσεων
        System.out.println("Προηγούμενες 10 κληρώσεις:");
        for (int[] draw : pastDraws) {
            System.out.println(Arrays.toString(draw));
        }

        // Ανάλυση των πιο συχνών αριθμών για τους 5 αριθμούς και τον αριθμό Τζόκερ
        Map<Integer, Integer> frequencyMap = calculateFrequency(pastDraws);

        // Προτεινόμενοι αριθμοί με βάση τη συχνότητα
        System.out.println("\nΠροτεινόμενοι αριθμοί (συχνότεροι):");
        suggestNumbers(frequencyMap, rand);
    }

    // Γεννά 10 προηγούμενες κληρώσεις
    private static List<int[]> generatePastDraws(Random rand) {
        List<int[]> draws = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Set<Integer> mainNumbers = new HashSet<>();
            while (mainNumbers.size() < 5) {
                mainNumbers.add(rand.nextInt(45) + 1);
            }

            int[] draw = new int[6];  // 5 αριθμοί + 1 Τζόκερ
            int idx = 0;
            for (int num : mainNumbers) {
                draw[idx++] = num;
            }
            draw[5] = rand.nextInt(20) + 1;  // Επιλογή Τζόκερ από 1 έως 20
            draws.add(draw);
        }
        return draws;
    }

    // Υπολογίζει τη συχνότητα εμφάνισης των αριθμών
    private static Map<Integer, Integer> calculateFrequency(List<int[]> pastDraws) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Υπολογισμός συχνότητας για τους 5 αριθμούς και τον αριθμό Τζόκερ
        for (int[] draw : pastDraws) {
            for (int i = 0; i < 5; i++) {  // 5 κύριοι αριθμοί
                frequencyMap.put(draw[i], frequencyMap.getOrDefault(draw[i], 0) + 1);
            }
            frequencyMap.put(draw[5], frequencyMap.getOrDefault(draw[5], 0) + 1);  // Τζόκερ
        }

        return frequencyMap;
    }

    // Προτείνει αριθμούς με βάση τη συχνότητα
    private static void suggestNumbers(Map<Integer, Integer> frequencyMap, Random rand) {
        List<Map.Entry<Integer, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());

        // Ταξινόμηση της συχνότητας σε φθίνουσα σειρά
        sortedEntries.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());

        // Εκτύπωση των πιο συχνών αριθμών για τους κύριους αριθμούς και το Τζόκερ
        System.out.print("Πιο συχνοί αριθμοί: ");
        for (int i = 0; i < 5 && i < sortedEntries.size(); i++) {
            System.out.print(sortedEntries.get(i).getKey() + " ");
        }
        System.out.println();

        // Πρόταση για το Τζόκερ
        System.out.println("Πιο συχνό Τζόκερ: " + sortedEntries.get(0).getKey());
    }
}

