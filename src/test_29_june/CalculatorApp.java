package test_29_june;

import java.util.Scanner;

public class CalculatorApp{

//Write a calculator App with Scanner
//ask user for choice : 3 for addition 6 for subtraction , 9 - for multiply and 12 for divide?

    public int add(int a , int b){
        return a+b;
    }

    public int sub(int a, int b){
        return a-b;
    }

    public int multi(int a, int b){
        return a*b;
    }

    public int div(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {

        String flag="A";

        Scanner obj =new Scanner(System.in);
        methods.scanner.CalculatorApp cal=new methods.scanner.CalculatorApp();
        while (flag.equals("A")) {

            System.out.println("Please enter value of a: ");
            int a = obj.nextInt();

            System.out.println("Please enter value of b: ");
            int b = obj.nextInt();

            System.out.println("Please enter choice , 3-Add, 6- Sub , 9- Multi, 12 divide");
            int choice = obj.nextInt();

            if (choice == 3) {
                System.out.println("Addition of given number is : " + cal.add(a, b));
            }

            if (choice == 6) {
                System.out.println("subtraction of given number is : " + cal.sub(a, b));
            }

            if (choice == 9) {
                System.out.println("multiplication of given number : " + cal.multi(a, b));
            }

            if (choice == 12) {
                System.out.println("division of given number : " + cal.div(a, b));
            }


            Scanner OBJ2 = new Scanner(System.in);
            System.out.println("press A for continos or press any key to exit....");
            flag = OBJ2.nextLine();
            if (!flag.equals("A")) {
                System.out.println("thanks for using the APP ....exit");
                break;

            }

        }
    }
}
