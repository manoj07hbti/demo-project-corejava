package methods.scanner;

import java.util.Scanner;

public class CalculatorApp {

    public int add(int a , int b){
        return a+b;
    }

    public static void main(String[] args) {

        Scanner obj =new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a=obj.nextInt();
        System.out.println("Please enter value of a: ");
        int b=obj.nextInt();
        System.out.println("Please enter choice , 1-Add, 2- Sub , 3- Multi, 4 divide ");
        int choice=obj.nextInt();

        CalculatorApp cal=new CalculatorApp();
        if(choice==1){
            System.out.println("Addition of given number is : "+cal.add(a,b));
        }


    }
}
