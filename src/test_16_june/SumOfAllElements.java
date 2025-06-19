package test_16_june;

public class SumOfAllElements {
    public static void main(String[] args) {

        //1. Sum of All Elements
        // Problem: Write a Java program to calculate the sum of all elements in an integer array.
        // Example:
        // Input: {1, 2, 3, 4, 5} → Output: 15

        int[] elements = {1, 2, 3, 4, 5};
        int sum = 0;
        for ( int i=0 ; i <  elements.length ; i++ ){
            sum += elements[i] ;
        }System.out.println("Sum of All Elements: " +sum);
     }
}

