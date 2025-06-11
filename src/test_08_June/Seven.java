package test_08_June;

import java.util.Arrays;

public class Seven {
    /*
    7. Binary search of finding element in array.
     */

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int target = 11;

        int res = Arrays.binarySearch(arr, target);
        if (res >= 0){
            System.out.println("Element at index: "+res);
        }else {
            System.out.println("Element not found");
        }
    }
}
