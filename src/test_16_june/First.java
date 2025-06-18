package test_16_june;

public class First {

    /*
    1. Sum of All Elements
    Problem: Write a Java program to calculate the sum of all elements in an integer array.
    Example:
    Input: {1, 2, 3, 4, 5} → Output: 15
     */

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int result = 0;
        for (int i = 0; i<arr.length; i++){
            result += arr[i];
        }
        System.out.println(result);
    }
}
