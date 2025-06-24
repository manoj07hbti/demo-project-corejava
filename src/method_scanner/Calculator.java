package method_scanner;

import java.util.Scanner;

public class Calculator {

    public int add(int a,int b) {

        int sum = a + b;
        return sum;
    }
    public int sub(int a,int b) {

        int sub = a - b;
        return sub;
    }
    public int multi(int a,int b) {

        int multi = a * b;
        return multi;
    }
    public int div(int a,int b) {

        int div = a / b;
        return div;
    }

    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);
        System.out.println("please enter value a: ");
        int a= obj.nextInt();
        System.out.println("please enter value of b: ");
        int b= obj.nextInt();
        System.out.println("please enter your choice : 1-addition, 2-subtract, 3-multiply, 4-division ");
        int choice= obj.nextInt();

        Calculator obj1= new Calculator();
       switch (choice){
           case 1:
               System.out.println("addition of given number is= "+obj1.add(a,b));
               break;
           case 2:
               System.out.println("subtract of given number is= "+obj1.sub(a,b));
               break;
           case 3:
               System.out.println("multiply of given number is= "+obj1.multi(a,b));
               break;
           case 4:
               System.out.println("division of given number is= "+obj1.div(a,b));
               break;


       }

    }



}
