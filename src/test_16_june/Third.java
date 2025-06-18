package test_16_june;

import java.util.Arrays;

public class Third {
    /*
    3. Reverse an Array
    Problem: Write a Java program to reverse the elements of a given array.
    Example:
    Input: {1, 2, 3, 4} → Output: {4, 3, 2, 1}
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] res = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }

        System.out.println("Reversed Array: " + Arrays.toString(res));
    }
}
