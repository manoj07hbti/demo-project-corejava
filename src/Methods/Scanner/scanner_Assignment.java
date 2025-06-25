package Methods.Scanner;

import java.util.Scanner;

public class scanner_Assignment {

    //Addition
    public int Add(int a, int b){
        return a+b;
    }
    //Subtraction
    public int Sub(int a, int b){
        return a-b;
    }
    //Multiply
    public int Multi(int a, int b){
        return a*b;
    }
    //Divide
    public double Divide(float a, float b){
        return a/b;
    }
    //Input for first variable
    public int input_a(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Value: ");
        int a = scanner.nextInt();
        return a;
    }
    //Input for Second variable
    public int input_b(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Value: ");
        int b = scanner.nextInt();
        return b;
    }

    // Main Method
    public static void main(String[] args) {

        scanner_Assignment obj = new scanner_Assignment();
        Scanner scan = new Scanner(System.in);
        String Ask = "Yes";

        // While loop for Continuity
        while (Ask.equals("Yes")){

            System.out.print("What You want to do. (Addition, Subtraction, Multiply, Divide): ");
            String Choice = scan.nextLine();

            if (Choice.equals("Addition")){
                System.out.println("Addition is "+obj.Add(obj.input_a(), obj.input_b()));
            } else if (Choice.equals("Subtraction")) {
                System.out.println("Subtraction is "+obj.Sub(obj.input_a(),obj.input_b()));
            } else if (Choice.equals("Multiply")) {
                System.out.println("Multiply is "+obj.Multi(obj.input_a(), obj.input_b()));
            } else if (Choice.equals("Divide")) {
                System.out.println("Divide is "+obj.Divide(obj.input_a(), obj.input_b()));
            }else {
                System.out.println("Invalid Choice. Please Try Again.........");
            }

            System.out.print("Do you Calculate again (Yes/No): ");
            Ask = scan.nextLine();
        }
    }
}
