package gr.aueb.cf.ch6;

/**
 * Dhlwsh kai arxikopoihsh enos pinaka .
 * Populate ena pinaka.
 * - new
 * - unisized init
 * - array initializer
 * - print to stoixeia enos pinaka
 */


public class ArrayInit {

    public static void main(String[] args) {

        int[] arr = new int[3];           //declare and init
        int[] arr2 = { 1, 2, 3, 4, 5 };   //unisized init
        int[] arr3 ;                      //array declare
        arr3 = new int[] {1, 2, 3, 4, 5}; //array init

        //populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        //traverse
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "");
        }

        //enchanced for
        for (int el : arr3) {
            System.out.println(el + " ");
        }
    }
}
