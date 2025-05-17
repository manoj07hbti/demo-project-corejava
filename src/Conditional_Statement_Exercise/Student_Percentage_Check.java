package Conditional_Statement_Exercise;

import java.util.Scanner;

public class Student_Percentage_Check {
    /*
    Wrtie a code to check % of Student
        1. percentage >=33 and <60  : Second division
        2. percentage >=60 and <75: First Division
        3. percentage >75 Gold Madelist
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Percent: ");
        int Percentage = scanner.nextInt();

        if (Percentage >= 33 && Percentage < 60){
            System.out.println("You Passed with Second Division.");
        } else if (Percentage >= 60 && Percentage < 75) {
            System.out.println("You Passed with First Division.");
        } else if (Percentage >= 75 && Percentage <= 100) {
            System.out.println("You are Gold Medalist.");
        } else if (Percentage > 100) {
            System.out.println("Invalid Percentage fill only between 1 to 100.");
        } else {
            System.out.println("You are Failed in Exam.");
        }
    }
}
