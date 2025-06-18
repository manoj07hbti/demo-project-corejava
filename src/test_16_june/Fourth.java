package test_16_june;

public class Fourth {
    /*
    4. Count Even and Odd Numbers in an Array
    Problem: Write a Java program to count the number of even and odd numbers in an array.
    Example:
    Input: {1, 2, 3, 4, 5, 6}
    Output: Even: 3, Odd: 3
     */
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int even =0;
        int odd=0;
        for (int i = 0; i<arr.length; i++){

            if (arr[i]%2 ==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}
