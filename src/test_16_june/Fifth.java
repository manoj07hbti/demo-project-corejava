package test_16_june;

public class Fifth {
    /*
    5.Calculate Average of Array Elements
    Problem: Write a Java method to calculate the average (mean) of array elements.
    Example:
    Input: {5, 10, 15}→Output:10.0
     */
    public static void main(String[] args) {
        int arr[] = {5,10,15};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int result = sum/arr.length;
        System.out.println(result);
    }
}
