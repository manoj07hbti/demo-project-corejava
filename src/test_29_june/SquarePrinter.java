package test_29_june;

public class SquarePrinter {
    // Question 2
    public int getSquare(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        SquarePrinter obj = new SquarePrinter();

        System.out.println("Squares of numbers from 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            int square = obj.getSquare(i);
            System.out.println("Square of " + i + " is: " + square);
        }
    }
}
