package test_08_june;

public class CountTheNumberOfOddEvenNumber {
    public static void main(String[] args) {

        //5. Count the Number of Even and Odd Elements
        //Input: [1, 2, 3, 4, 5, 6]
        //Output: Even: 3, Odd: 3

        int[] arr = {1, 2, 3, 4, 5, 6};
        int even = 0, odd = 0;
        for (int num : arr) {
            if (num % 2 == 0)
                even++;  // even variable given above gets add app
            else
                odd++;
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}
