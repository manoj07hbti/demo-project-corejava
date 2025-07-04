package test_29_june;

public class PrimeChecker {

    public boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeChecker obj = new PrimeChecker();

        System.out.println("Prime numbers between 10 and 20:");

        for (int i = 1; i <= 10; i++) {
            if (obj.isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

