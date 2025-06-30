package test_29_june;

import java.util.Scanner;

public class Calculator
{
    public int addition(int a, int b)
    {
        return a+b;
    }
    public int subtraction(int a, int b)
    {
        return a-b;
    }
    public int multiplication(int a, int b)
    {
        return a*b;
    }
    public double division(int a, int b)
    {
        return (double) a/b;
    }

    public static void main(String[] args)
    {
        String flag = "Y";

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (flag.equalsIgnoreCase("Y"))
        {
            System.out.println("Enter value of a:");
            int a = scanner.nextInt();
            System.out.println("Enter value of b:");
            int b = scanner.nextInt();
            System.out.println("Select an option, 10- Addition, 20- Subtraction, 30- Multiplication, 40- Division");
            int option = scanner.nextInt();

            switch (option)
            {
                case 10:
                    System.out.println("Result of addition: "+calculator.addition(a,b));
                    break;
                case 20:
                    System.out.println("Result of subtraction: "+calculator.subtraction(a,b));
                    break;
                case 30:
                    System.out.println("Result of multiplication: "+calculator.multiplication(a,b));
                    break;
                case 40:
                    System.out.println("Result of division: "+calculator.division(a,b));
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println("Press 'Y' to continue for another operations or any other key to exit");
            flag = scanner.next();
        }
    }
}
