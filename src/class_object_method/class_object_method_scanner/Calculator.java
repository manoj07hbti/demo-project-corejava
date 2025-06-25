package class_object_method.class_object_method_scanner;



import java.util.Scanner;

public class Calculator {



        //3- Create calculator based on choice
        //if choice ==1- add , ==2 - sub , 3 - mul 4-divide

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

            Scanner obj = new Scanner(System.in);

            //call scanner object
            System.out.println("Please enter value of num1: ");
            int a = obj.nextInt();

            System.out.println("Please enter value of num2: ");
            int b = obj.nextInt();

            System.out.println("Please Enter Choice: 1-Add, 2-Sub,3-Multiply, 4-Divide");
            int operationChoice = obj.nextInt();

            //Object for Method
            class_object_method.method_returntype.Choice_Calculator calculator = new class_object_method.method_returntype.Choice_Calculator();


            if (operationChoice == 1) {
                System.out.println("Addition of Given Number : "+calculator.add(a, b));

            } else if (operationChoice == 2) {
                System.out.println("Subtraction of Given Number : "+calculator.sub(a, b));
            } else if (operationChoice == 3) {
                System.out.println("Multiplication of Given Number : "+calculator.multiply(a, b));
            } else {
                System.out.println("Division of Given Number : "+calculator.divide(a, b));
            }


        }
    }

