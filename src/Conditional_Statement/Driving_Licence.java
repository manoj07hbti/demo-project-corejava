package Conditional_Statement;

import java.util.Scanner;

public class Driving_Licence {
    // wrtie a code to check whether person is elligible for driving licence based on condition of age, age should greater than 18.
    public static void main(String[] args) {
        Scanner new_scanner = new Scanner(System.in);
        System.out.print("Please Enter your Age Here: ");
        int age = new_scanner.nextInt();

        if(age >= 18){
            System.out.println("You are eligible for Driving Licence because your age is "+age+".");
        }
        else {
            System.out.println("You are not eligible for Driving Licence because your age is "+age+".");
        }
    }
}
