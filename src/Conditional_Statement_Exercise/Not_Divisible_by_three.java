package Conditional_Statement_Exercise;

import java.util.Scanner;

public class Not_Divisible_by_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();
        if(num % 3 != 0){
            System.out.println(num+" is not divisible by 3.");
        }
        else {
            System.out.println(num+" is divisible by 3.");
        }
    }
}
