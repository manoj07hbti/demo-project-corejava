package test_08_june;

public class SumOfElements_in_Array {
    public static void main(String[] args) {

        //2. Sum of All Elements in an Array

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // a+=b  => a=a+b
        }
        System.out.println("Sum of array length : " + sum); // Output: Sum: 15
    }
}