package test_16_june;

public class Odd_Even {
    public static void main(String[] args) {

        //4. Count Even and Odd Numbers in an Array
        //Problem: Write a Java program to count the number of even and odd numbers in an array.
        //Example:
        //Input: {1, 2, 3, 4, 5, 6}
        //Output: Even: 3, Odd: 3

        int[] array = {12, 24, 36, 41, 55, 61};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                even++;
            else
                odd++;
        }System.out.println( "Even:" + even + "  Odd:" + odd);
    }
}
