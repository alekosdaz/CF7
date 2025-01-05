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



    public static int maxSubArray(int[] nums) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {

            currentSum = Math.max(num, currentSum + num);

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }


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