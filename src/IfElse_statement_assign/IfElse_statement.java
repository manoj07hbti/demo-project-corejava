package IfElse_statement_assign;

public class IfElse_statement {

    //write a code to check voting elligiblity .
    //if candidate is elligible then show mesage "Welcome to Voting System"
    //if not then "you are not elligible for Voting as your age is less than 18 Year"

    public static void main(String[] args) {
        int age = 55;
        if (age >= 18) {
            System.out.println("Welcome to voting System " + age);
        } else{
                System.out.println("you are not elligible for Voting as your age is less than 18 Year " +age);
            }
        }
    }
