package Calculator;

import java.util.Scanner;

public class Calc {

    public int Addition(int a, int b){
        return a+b;
    }
    public int Subtraction(int a, int b){
        return a-b;
    }
    public int Multiply(int a, int b){
        return a*b;
    }
    public int Divide(int a, int b){
        return a/b;
    }

    public int Scan_a() {                 // no longer used in main, but kept
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Value: ");
        return scan.nextInt();
    }
    public int Scan_b() {                 // no longer used in main, but kept
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Second Value: ");
        return scan.nextInt();
    }

    public static void main(String[] args) {
        Calc obj = new Calc();
        Scanner scan = new Scanner(System.in);

        System.out.println("Type tokens one by one and press Enter after each.");
        System.out.println("Example input sequence:");
        System.out.println("2  ⏎\n+  ⏎\n3  ⏎\n-  ⏎\n4  ⏎\n=  ⏎");
        System.out.println("----------------------------------------------");

        int result = scan.nextInt();

        while (true){
            String op = scan.next().trim();
            if (op.equals("=")){
                System.out.println("Answer is "+result);
                break;
            }
            int next = scan.nextInt();

            if (op.equals("+")) {
                result = obj.Addition(result, next);
            } else if (op.equals("-")) {
                result = obj.Subtraction(result, next);
            } else if (op.equals("*")) {
                result = obj.Multiply(result, next);
            } else if (op.equals("/")) {
                result = obj.Divide(result, next);
            } else {
                System.out.println("Invalid operator: " + op);
                break;
            }
        }
    }
}
