package test_16_june;

public class Finding_Lowest_Element_In_Array {
    public static void main(String[] args) {

        //2. Find Lowest Element in Array
        //Problem: Write a Java method to find the maximum element in an integer array.
        //Example:
        //Input: {10, 20, 5, 8} → Output: 5

        int[] element = {10, 20, 5, 8};
        int minimum = 10 ;
        for ( int i=0 ; i<element.length ; i++){
            if(minimum > element[i] )
                minimum = element[i];
        }System.out.println(minimum);
    }
}
