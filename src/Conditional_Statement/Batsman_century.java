package Conditional_Statement;

import java.util.Scanner;
public class Batsman_century {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter batsman Score Here: ");
        int Batsman_Score = scanner.nextInt();

        if(Batsman_Score >= 100){
            System.out.println("Batsman completed Century because Batsman Score is "+Batsman_Score+".");
        }
        else {
            System.out.println("Batsman did not complete Century because Batsman Score is "+Batsman_Score+".");
        }
    }
}
