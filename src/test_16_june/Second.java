package test_16_june;

public class Second {
    /*
    2. Find Lowest Element in Array
    Problem: Write a Java method to find the maximum element in an integer array.
    Example:
    Input: {10, 20, 5, 8} → Output: 5
     */
    public static void main(String[] args) {
        int arr[] = {10, 20, 5, 8};
        int result = arr[0];

        for (int i = 0; i< arr.length; i++){
            if (arr[i]<result){
                result=arr[i];
            }
        }
        System.out.println(result);
    }
}
