package Conditional_Statement_Exercise;

import java.util.Scanner;

public class Check_Age_Group {
    /*
    rite a code to check Age group
  1. age >0 and <18  : Child
  2. age >=18  and <=40 : Young
  3. age >=60 Old Age
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int Age = scanner.nextInt();
        if (Age > 0 && Age <18){
            System.out.println("You are a Child.");
        } else if (Age >= 18 && Age <= 40) {
            System.out.println("You are Young.");
        } else {
            System.out.println("You are Old.");
        }
    }
}
