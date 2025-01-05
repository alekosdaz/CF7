package gr.aueb.cf.projects.project2;

public class project2 {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};


        // Επαναληπτική λύση
        int resultIterative = maxSubArray(nums);
        System.out.println("Το μέγιστο άθροισμα (επαναληπτική): " + resultIterative);

        // Αναδρομική λύση
        int resultRecursive = maxSubArrayRecursive(nums);
        System.out.println("Το μέγιστο άθροισμα (αναδρομική): " + resultRecursive);
    }

    // (γ) Πολυπλοκότητα
    // - Χρονική Πολυπλοκότητα: O(n)
    //   Στην επαναληπτική υλοποίηση, διατρέχουμε τον πίνακα μία φορά (n στοιχεία).
    //   Στην αναδρομική υλοποίηση, κάθε στοιχείο υπολογίζεται μία φορά λόγω αποθήκευσης (memoization).
    // - Χωρική Πολυπλοκότητα: O(1) για την επαναληπτική υλοποίηση (χρησιμοποιούμε σταθερό χώρο).
    //   Στην αναδρομική, η στοίβα κλήσεων απαιτεί O(n) χώρο.



    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE; // Ξεκινάμε με την ελάχιστη δυνατή τιμή

        for (int num : nums) {
            // Επιλέγουμε αν θα συνεχίσουμε τον υποπίνακα ή αν θα ξεκινήσουμε νέο
            currentSum = Math.max(num, currentSum + num);
            // Ενημερώνουμε το μέγιστο άθροισμα
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // Αναδρομική προσέγγιση με static globalMaximum
    private static int globalMaximum;

    public static int maxSubArrayRecursive(int[] nums) {
        globalMaximum = Integer.MIN_VALUE;
        calculateMaxSubArray(nums, nums.length - 1);
        return globalMaximum;
    }

    private static int calculateMaxSubArray(int[] nums, int index) {
        if (index == 0) {
            globalMaximum = Math.max(globalMaximum, nums[0]);
            return nums[0];
        }

        int localMaximum = Math.max(nums[index], calculateMaxSubArray(nums, index - 1) + nums[index]);
        globalMaximum = Math.max(globalMaximum, localMaximum);
        return localMaximum;
    }


}