package test_16_june;

public class Reverse_An_Array {
    public static void main(String[] args) {

        //3. Reverse an Array
        //Problem: Write a Java program to reverse the elements of a given array.
        //Example:
        //Input: {1, 2, 3, 4} → Output: {4, 3, 2, 1}

        int[] array= { 1 , 2 , 3 , 4 };
        System.out.print("Reverse of array is ...");
        for (int i=3 ; i > -1 ; i--){
            System.out.print(array[i]);

        }
    }
}
