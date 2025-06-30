package Test_29_june;

import java.util.Scanner;

public class Test_Calculator {
    /*
    Harsh
    Write a calculator App with Scanner
    ask user for choice : 2 for addition 4 for subtraction , 6 - for multiply and 8 for divide
     */

    public int Addition(int a, int b){
        int result = a+b;
        return result;
    }
    public int Subtraction(int a, int b){
        int result = a-b;
        return result;
    }
    public int Multiply(int a, int b){
        int result = a*b;
        return result;
    }
    public int Divide(int a, int b){
        int result = a/b;
        return result;
    }
    public int Scan_a(){
        Scanner Scan_a = new Scanner(System.in);
        System.out.print("Enter First Value: ");
        int a = Scan_a.nextInt();
        return a;
    }
    public int Scan_b(){
        Scanner Scan_b = new Scanner(System.in);
        System.out.print("Enter Second Value: ");
        int b = Scan_b.nextInt();
        return b;
    }

    public static void main(String[] args) {
        Test_Calculator obj = new Test_Calculator();
        Scanner scan = new Scanner(System.in);
        String Flag = "Yes";
        while (Flag.equals("Yes")){
            System.out.print("What do you want to do(2. for Addition, 4. for Subtraction, 6. for Multiply, 8. for Divide):");
            int choice = scan.nextInt();
            if (choice==2){
                System.out.println(obj.Addition(obj.Scan_a(),obj.Scan_b()));
            } else if (choice==4) {
                System.out.println(obj.Subtraction(obj.Scan_a(), obj.Scan_b()));
            } else if (choice==6) {
                System.out.println(obj.Multiply(obj.Scan_a(), obj.Scan_b()));
            } else if (choice==8) {
                System.out.println(obj.Divide(obj.Scan_a(),obj.Scan_b()));
            }else {
                System.out.println("Invalid Choice.");
            }

            System.out.print("Do you want to calculat again press 'Yes' otherwise press any key: ");
            Flag = scan.next();
        }
    }

}
