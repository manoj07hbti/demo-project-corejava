package method_scanner;

import java.util.Scanner;

public class Odd_Even {

    public String even_Odd(int number ) {

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter number 1 to 1000 ");
        int a = obj.nextInt();
        Odd_Even value = new Odd_Even();
        System.out.println(value.even_Odd(a));

    }
}



