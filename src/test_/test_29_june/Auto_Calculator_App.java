package test_.test_29_june;

import class_object_method.method_returntype.Choice_Calculator;

import java.util.Scanner;

public class Auto_Calculator_App {

    //Create calculator based on choice
    //if choice ==4- add , ==8 - sub , 12 - mul 16-divide

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }


    public static void main(String[] args) {

        String flag ="Y";
        //Object for Method
        class_object_method.method_returntype.Choice_Calculator calculator = new class_object_method.method_returntype.Choice_Calculator();

        Scanner obj = new Scanner(System.in);

        //Infinite Loop
        while (flag.equals("Y")){

            //call scanner object
            System.out.println("Please enter value of num1: ");
            int a = obj.nextInt();

            System.out.println("Please enter value of num2: ");
            int b = obj.nextInt();

            System.out.println("Please Enter Choice: 4-Add, 8-Sub,12-Multiply, 16-Divide");
            int operationChoice = obj.nextInt();

            if (operationChoice == 4) {
                System.out.println("Addition of Given Number : "+calculator.add(a, b));

            } else if (operationChoice == 8) {
                System.out.println("Subtraction of Given Number : "+calculator.sub(a, b));
            } else if (operationChoice == 12) {
                System.out.println("Multiplication of Given Number : "+calculator.multiply(a, b));
            } else {
                System.out.println("Division of Given Number : "+calculator.divide(a, b));
            }

            // create one more Scanner obj
            Scanner obj2= new Scanner(System.in);

            System.out.println("Press Y to continue or any other key to exit");
            flag= obj2.nextLine();
            if (!flag.equals("Y")){
                System.out.println("Thanks for Using Calculator App.....");
                break;
            }

        }

    }
}