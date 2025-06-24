package Methods.Scanner;

import java.util.Scanner;

public class scanner_Assignment {

    public int Add(int a, int b){
        return a+b;
    }
    public int Sub(int a, int b){
        return a-b;
    }
    public int Multi(int a, int b){
        return a*b;
    }
    public double Divide(int a, int b){
        return a/b;
    }

    public int input_a(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Value: ");
        int a = scanner.nextInt();
        return a;
    }

    public int input_b(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Value: ");
        int b = scanner.nextInt();
        return b;
    }

    public static void main(String[] args) {

        scanner_Assignment obj = new scanner_Assignment();
        Scanner scan = new Scanner(System.in);

        System.out.print("What You want to do. (1 for Addition, 2 for Subtraction, 3 for Multiply, 4 for Divide): ");
        int Choice = scan.nextInt();

        if (Choice==1){
            int result = obj.Add(obj.input_a(), obj.input_b());
            System.out.println(result);
        } else if (Choice==2) {
            int result = obj.Sub(obj.input_a(),obj.input_b());
            System.out.println(result);
        } else if (Choice==3) {
            int result = obj.Multi(obj.input_a(), obj.input_b());
            System.out.println(result);
        } else if (Choice==4) {
            double result = obj.Divide(obj.input_a(), obj.input_b());
            System.out.println(result);
        }else {
            System.out.println("Invalid Choice. Please Try Again.........");
        }


    }
}
