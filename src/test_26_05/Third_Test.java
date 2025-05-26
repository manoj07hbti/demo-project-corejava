package test_26_05;

public class Third_Test {
    public static void main(String[] args) {
        /*
        Q3- write a program to print

            *
            **
            ***
            ****
            *****
            1
            12
            123
            1234
            12345

         */

        // For * Pattern
        for (int i = 1; i<= 5; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // For counting Pattern

        for (int a = 1; a<= 5; a++) {
            for (int b = 1; b <= a; b++){
                System.out.print(b);
            }
            System.out.println();
        }
    }
}
