package gr.aueb.cf.exersises.firstexersises;

public class GetMaxPosition {

    public static void main(String[] args) {
        int[] arr = {30, 40, 7, 20, 5, 7, 0, 9};

        // Get the max position between indices 2 and 6 (inclusive)
        int maxIndex = getMaxPosition(arr, 0, 7);
        int secondLowest = getSecondLowestValue(arr);

        System.out.println("The index of the maximum element in the range is: " + maxIndex);
        System.out.println("The second lowest value is: " + secondLowest);

    }

    public static int getSecondLowestValue(int[] arr) {
        // If the array has less than 2 elements, we can't find a second lowest value
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        // Initialize the smallest and second smallest values
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Traverse the array
        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest; // Update second smallest before updating smallest
                smallest = num; // Update smallest
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num; // Update second smallest
            }
        }

        // Return the second smallest value
        return secondSmallest;
    }


    public static int getMaxPosition(int[] arr, int low, int high) {
        // Ensure that the range is valid
        if (arr == null || arr.length == 0 || low < 0 || high >= arr.length || low > high) {
            return -1; // Invalid range or empty array
        }

        int maxIndex = low; // Start by assuming the first element in the range is the max
        int maxValue = arr[low];

        // Iterate through the specified range to find the max value and its index
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxIndex = i;  // Update the index when a new max is found
            }
        }

        return maxIndex;
    }
}
