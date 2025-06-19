package test_16_june;

public class Average_Of_Array {
    public static void main(String[] args) {

        //5. Calculate Average of Array Elements
        //Problem: Write a Java method to calculate the average (mean) of array elements.
        //Example:
        //Input: { 5 , 10 , 15 , 43 , 54 , 43 } → Output: 28.0

        int[] array = { 5 , 10 , 15 , 43 , 54 , 43 };
        int sum = 0;
        for (int i=0 ; i<array.length ; i++){
            sum += array[i];
        }
        int average= sum / array.length;
        System.out.println(average);
    }
}
