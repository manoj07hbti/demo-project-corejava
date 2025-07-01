package test_29_june;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Calculator {

    public int addition( int a,int b){
        return(a+b);
    }

    public int subtraction( int a,int b){
        return(a-b);
    }

    public int multiply (int a,int b){
        return (a*b);
    }

    public double divide (double a,double b){
        return (a/b);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("please enter the value of a");
        int a= obj.nextInt();
        System.out.println("please enter the value of b");
        int b= obj.nextInt();
        System.out.println("please enter your choice: 2-addition , 4-subtraction , 6-multiply , 8-divide");

        int choice= obj.nextInt();

        Calculator cal=new Calculator();
        if(choice==2){
            System.out.println("Addition of given number is:" +cal.addition(a,b));
        }
        if(choice==4){
            System.out.println("subtraction of given number is: " +cal.subtraction(a,b));
        }
        if(choice==6){
            System.out.println("multiply of given number is: " +cal.multiply(a,b));
        }
        if(choice==8){
            System.out.println("division of given number is: " +cal.divide(a,b));
        }

    }
}
