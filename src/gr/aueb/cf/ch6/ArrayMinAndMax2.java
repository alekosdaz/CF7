package gr.aueb.cf.ch6;

import javax.swing.plaf.PanelUI;

public class ArrayMinAndMax2 {

    public static void main(String[] args) {

    }

    public static int getMinPosition(int[] arr){
        if (arr == null || arr.length < 1) return -1;
        int minPosition = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < minValue){
                minPosition = 1;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr){
        if (arr == null || arr.length < 1) return -1;
        int maxPosition = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxValue){
                maxPosition = 1;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }

    /**
     *
     * @param arr
     * @param low
     * @param high
     * @return
     */
    public static int getMinPosition(int[] arr, int low, int high){
        if (arr == null || arr.length < 1) return -1;
        if (low < 0 || high > arr.length - 1) return  -1;
        if (low > high) return -1;

        int minPosition = low;
        int minValue = arr[low];

        for (int i = low; i <= high; i++){
            if (arr[i] < minValue){
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }
}