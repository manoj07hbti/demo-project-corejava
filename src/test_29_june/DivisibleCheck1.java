package test_29_june;

public class DivisibleCheck1 {
    // QUESTION 1
    public boolean isDivisibleBy7AndEven(int number) {
        return (number % 7 == 0) && (number % 2 == 0);
    }

    public static void main(String[] args) {
        DivisibleCheck1 obj = new DivisibleCheck1();

        System.out.println("Numbers between 7 and 190 that are divisible by 7 and even:");

        for (int i = 7; i <= 190; i++) {
            if (obj.isDivisibleBy7AndEven(i)) {
                System.out.println(i);
            }
        }
    }
}
