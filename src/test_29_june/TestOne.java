package test_29_june;

import java.util.Scanner;

public class TestOne {

    //write a code to check any number number between 7 to 190
    // is divisible by 7 and it should not be odd number?

    public static void divnum() {


        for (int i = 7; i <= 190; i++) {
            if (i % 7 == 0 && i % 2 == 0) {
                System.out.println(i+" divisble by 7 and not a odd number");
            }else{
                System.out.println(i+" your number dosn't met required condition");
            }
        }
    }

    //write a code to print square of number between 1 and 10
    //like 1, 4, 9, 16, 25 ....100?

    public static void Square() {
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            System.out.print(square);

            // To print commas between numbers, but not after the last one
            if (i < 10) {
                System.out.print(", ");
            }
        }
    }
    //write a code to check any number number between 3 to 160
    // is divisible by 9 and it should not be odd number

    public static void div() {
        for (int s = 3; s <= 160; s++) {
            if (s % 9 == 0 && s % 2 == 0) {
                System.out.println(s);
            }
        }
    }
    //write a code to print cube of number starting from 1 to 10
    //like 1, 8 , 27, 64 ....1000

    public static void cube(){
        for (int i = 1; i <= 10; i++) {
            int cube = i * i * i;
            System.out.print(cube);
            if (i < 10) {
                System.out.print(", ");
            }
        }
    }
    //write a code to check any number number between 8 to 160
    // is divisible by 11 and it should not be odd number

    public static void notodd(){
        for (int i = 8; i <= 160; i++) {
            if (i % 11 == 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
    //write a code to check prime number between 1 to 10

    public static void prime(){

        int num=10;
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                System.out.print(i + " ");
            }
        }
    }


    public static void main(String[] args) {


        Scanner OBJ= new Scanner(System.in);

        System.out.println("choice 1-checkNumber b/w 7 to 190 , 2-square , 3- numberCheck b/w 3 to 160 , 4-checknmber b/w 8 to 160 , 5-primenumber" );
        int choice= OBJ.nextInt();

        if (choice==1){
            System.out.println("Numbers between 7 and 190 that are divisible by 7 and even:");
            divnum();
        }

        if (choice==2){
            System.out.println("Squares of numbers from 1 to 10:");
            Square();
        }

        if (choice==3){
            System.out.println("Numbers between 3 and 160 divisible by 9 and even:");
            div();
        }

        if (choice==4){
            System.out.println("Cubes of numbers from 1 to 10:");
            cube();
        }

        if (choice==4){
            System.out.println("Numbers between 8 and 160 divisible by 11 and even:");
            notodd();
        }

        if (choice==5){
            System.out.println("Prime numbers between 1 and 10:");
            prime();
        }

    }
}
