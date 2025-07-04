package method.scanner;
import java.util.Scanner;
public class CalculatorApp {
    public int add(int a, int b) {
        return a + b;
    }
    public int sub (int a, int b){
            return a-b;
        }
     public int mult (int a, int b) {
            return a * b;
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a=sc.nextInt();
        System.out.println("Enter number b: ");
        int b=sc.nextInt();
        System.out.println("Enter your choice 1-ADD, 2-Sub, 3-Mult, 4-Div");
        int choice=sc.nextInt();
        CalculatorApp obj= new CalculatorApp();
        if (choice==1){
            System.out.println("Addition of a and b: " + obj.add(a, b));
        } else if (choice==2){
            System.out.println("Subtraction of a and b: " + obj.sub(a, b));
        } else if (choice==3) {
            System.out.println("Multiplication of a and b: " + obj.mult(a, b));
        } else if (choice==4) {
            System.out.println("Division of a and b: " + obj.div(a, b));

        }

    }

    }


