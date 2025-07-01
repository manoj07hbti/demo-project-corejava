package test_.test_29_june;

public class Prime_Number_10_To_20 {

    public static void checkPrimeNumber() {
        System.out.println("***************** Prime numbers between 10 to 20 **************");

        for (int i = 10; i <= 20; i++) {
            boolean isPrime = true;

            // 1 is not a prime number
            if (i == 1) {
                isPrime = false;
            }

            // Check for factors from 2 to square root of i
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;  // Exit loop if we find a factor
                }
            }

            if (isPrime) {
                System.out.print(i + ", ");
            }
        }
        System.out.println(); // For better formatting
    }

    public static void main(String[] args) {

        Prime_Number_1_To_10 obj = new Prime_Number_1_To_10();
        obj.checkPrimeNumber();

    }
}
