package Conditional_Statement;

import java.util.Scanner;

/* write a code to check voting elligiblity .
if candidate is elligible then show mesage "Welcome to Voting System"

if not then "you are not elligible for Voting as your age is less than 18 Year"*/

public class Voting_System {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Your Age: ");
        int Age = scanner.nextInt();

        if(Age >= 18){
            System.out.println("Welcome to Voting System");
        }
        else {
            System.out.println("you are not eligible for Voting as your age is less than 18 Year");
        }
    }
}
