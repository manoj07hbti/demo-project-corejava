package test_29_june;

import java.util.Scanner;

public class Problems {

     // Method to check and print if the number is divisible by 7 and not odd (even)
        public static void checkNumber(int num) {
            if (num >= 7 && num <= 190) {
                if (num % 7 == 0 && num % 2 == 0) {
                    System.out.println(num + " is divisible by 7 and is even.");
                } else {
                    System.out.println(num + " does not satisfy both conditions (divisible by 7 and even).");
                }
            } else {
                System.out.println("Number not in the valid range (7 to 190).");
            }
        }

        //write a code to print square of number between 1 to 10
    //like  1 , 4, 9, 16 ,25 ....100
    public static void squareNumber(int num){
            if( num>=1 && num<=10){
                int square = num*num;
                System.out.println(" square of a given number is " + square );
            }else{
                System.out.println("number does not in range between 1 to 10");
            }
    }

    //write a code to check any  number between 3 to 160 is divisible
    // by 9 and it should not be odd number
    public static void numberCheck( int num){
            if(num>=3 && num<=160){
                if(num%9 ==0 && num%2==0){
                    System.out.println(num + "number is divisible by 9 and not a odd number");
                }else {
                    System.out.println(num + "either number is not divisible by 9 or an odd number");}
            }else{
                System.out.println("number is not in range");
            }
        }

        //write a code to print cube of number starting from 1 to 10
    //like 1, 8 , 27, 64 ....1000
    public static void cube(int num){
            if (num>=1 && num<=10){
                 int cube = num*num*num;
                System.out.println(num + "cube of the given number is: " +cube);
            }else {
                System.out.println(num +" given number is not in range b/w 1 to 10 ");
            }
    }

    //write a code to check any number number between 8 to 160 is divisible by
    // 11 and it should not be odd number
    public static void number(int num){
            if (num>=8 && num<=160){
                if (num%11==0 && num%2 == 0){
                    System.out.println(num + " number is divisible by 11 and not a odd number ");
                }else {
                    System.out.println(num + "either number is not divisible by 11 or an odd number");
                }
            }else {
                System.out.println("number is not in range");
            }
    }



        public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);

            System.out.println("choice 1-checkNumber b/w 7 to 190 , 2-square , " +
                    "3- numberCheck b/w 3 to 160 , 4-cube , 5-number b/w 8to160");
            int choice= obj.nextInt();

            if(choice==1){
                System.out.print("Enter a number between 7 and 190: ");
                int userInput = obj.nextInt();
                checkNumber(userInput);
            }
            if(choice==2){
                System.out.println(" enter a number between 1 to 10 to check sqaure of a number");
                int userInput = obj.nextInt();
                squareNumber(userInput);
            }
            if (choice==3){
                System.out.print("Enter a number between 3 and 160: ");
                int userInput = obj.nextInt();
                numberCheck(userInput);
            }
            if (choice==4){
                System.out.println(" enter a number between 1 to 10 to check cube of a number");
                int userInput = obj.nextInt();
                cube(userInput);
            }
            if (choice==5){
                System.out.print("Enter a number between 8 and 160: ");
                int userInput = obj.nextInt();
                number(userInput);
            }
        }
    }
