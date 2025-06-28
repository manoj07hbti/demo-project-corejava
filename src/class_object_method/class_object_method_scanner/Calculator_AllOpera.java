package class_object_method.class_object_method_scanner;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator_AllOpera {

    // Write a code to All Operation (Add, Subtract, Multiply and Divide) at one time


    // Method to perform and display all operations at once
    public double [] performAllOperation(double num1, double num2){
        double sum = num1+num2;
        double sub = num1-num2;
        double multiply = num1*num2;
        double quotient;

        if (num2==0){
            quotient=Double.POSITIVE_INFINITY;
        }else {
            quotient =num1/num2;
        }

       // Display all operations
        System.out.println("Sum: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + sub);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + multiply);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);

         return new double[]{sum,sub,multiply,quotient};

    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        Calculator_AllOpera cal = new Calculator_AllOpera();

        System.out.println("Please enter value of num1...");
        double num1=obj.nextDouble();

        System.out.println("Please enter value of num2...");
        double num2=obj.nextDouble();

      //  System.out.println(Arrays.toString(cal.performAllOperation(num1, num2)));

        double[] results = cal.performAllOperation(num1, num2);

        // Display returned results in a readable way
        System.out.println("\nReturned Results (as Array):");
        System.out.println("Sum: " + results[0]);
        System.out.println("Subtraction: " + results[1]);
        System.out.println("Multiplication: " + results[2]);
        System.out.println("Division: " + results[3]);



    }


}
