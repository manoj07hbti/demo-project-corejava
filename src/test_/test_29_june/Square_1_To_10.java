package test_.test_29_june;

public class Square_1_To_10 {

    // Method : Print squares of numbers from 1 to 10
    public void printSquaresFrom1To10() {
        System.out.println("\n"); // Spacing
        System.out.println("***************** Square of numbers between 1 to 10 **************");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i + ", ");
        }
    }

    public static void main(String[] args) {
        Square_1_To_10 obj = new Square_1_To_10();
        obj.printSquaresFrom1To10();
    }
}
