package test_29_june;
import java.util.Scanner;
public class CalculatorApp {
    public double percent (int a, int b){
        if (b == 0) {
            System.out.println("Cannot calculate percentage: b is zero.");
            return 0;
        }
        return (double)(a / b) * 100;
}
   // ask user for choice :3 for percentage, 5 for addition 10 for subtraction , 15 - for multiply and 20 for divide
    public int add (int a, int b){
        return a+b;
    }
    public int sub (int a, int b) {
        return a-b;
    }
    public int mult (int a, int b){
      return a*b;
    }
    public double div (int a, int b){
        if (b==0){
            System.out.println("Error Number cannot divide by zero");
            return 0;
        }else{
            return (double) a/b;
        }
    }
    public static void main(String[] args) {
        String flag = "y";
        Scanner sc = new Scanner(System.in);
        CalculatorApp obj = new CalculatorApp();
        while (flag.equals("y")){

            System.out.println("Enter number a: ");
            int a = sc.nextInt();
            System.out.println("Enter number b: ");
            int b = sc.nextInt();
            System.out.println("Enter your choice 3-Percent, 5-Add, 10-Sub, 15-Mult, 20-Div");
            int choice = sc.nextInt();
            if (choice == 3) {
                System.out.println("Percentage of a and b: " + obj.percent(a, b));
            } else if (choice == 5) {
                System.out.println("Addition of a and b: " + obj.add(a, b));
            } else if (choice == 10) {
                System.out.println("Subtraction of a and b: " + obj.sub(a, b));
            } else if (choice == 15) {
                System.out.println("multiplication of a and b: " + obj.mult(a, b));
            }
            else if (choice == 20){
                System.out.println("Division of a and b: " + obj.div(a, b));
            }
            Scanner obj2 = new Scanner(System.in);
            System.out.println("Press y to continue or press any other key to exit");
            flag = obj2.nextLine();
            if (!flag.equals("y")) {
                System.out.println("Exiting .....Thanks for Using Calculator App...");
                break;
            }
        }


    }



}
/*
import java.util.Scanner;

public class CalculatorApp {

    public double percent(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot calculate percentage: b is zero.");
            return 0;
        }
        return ((double) a / b) * 100;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public double div(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Number cannot be divided by zero.");
            return 0;
        } else {
            return (double) a / b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorApp obj = new CalculatorApp();
        String flag = "y";

        while (flag.equalsIgnoreCase("y")) {

            System.out.println("\nEnter number X:");
            int X = sc.nextInt();

            System.out.println("Enter number Y:");
            int Y = sc.nextInt();

            System.out.println("\nSelect Operation:");
            System.out.println("3  - Percentage");
            System.out.println("5  - Addition");
            System.out.println("10 - Subtraction");
            System.out.println("15 - Multiplication");
            System.out.println("20 - Division");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 3:
                    System.out.println("Percentage of X and Y: " + obj.percent(X, Y) + "%");
                    break;
                case 5:
                    System.out.println("Addition of X and Y: " + obj.add(X, Y));
                    break;
                case 10:
                    System.out.println("Subtraction of X and Y: " + obj.sub(X, Y));
                    break;
                case 15:
                    System.out.println("Multiplication of X and Y: " + obj.mult(X, Y));
                    break;
                case 20:
                    System.out.println("Division of X and Y: " + obj.div(X, Y));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.print("\nPress 'y' to continue or any other key to exit: ");
            flag = sc.next();
        }

        System.out.println("\nExiting... Thanks for using Calculator App.");
        sc.close();
    }
}

 */

