package test_26_05;

public class PrimeNumbers {
    public static void main(String[] args) {

        //Q2-write a program to check prime numbers between 1 to 20 (2,3,5,7,11,13,17,19)

        for (int i = 2; i <= 20; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                }
            }
            if (prime) {
                System.out.println(i + " is a prime number");
            } else {
                System.out.println(i + " is composite number");
            }
        }
    }
}
