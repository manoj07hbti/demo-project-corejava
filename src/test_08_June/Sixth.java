package test_08_June;

import java.util.Arrays;

public class Sixth {
    /*
    6. Find Duplicate Elements in an Array
    Input: [1, 2, 3, 4, 2, 3, 5]
    Output:[2,3]
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5};
        Arrays.sort(arr);

        System.out.print("Duplicate Number: ");

        for (int i = 1; i < arr.length; i++){
            if (arr[i] == arr[i - 1]){
                if (i == 1 || arr[i] != arr[i - 2]){
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
