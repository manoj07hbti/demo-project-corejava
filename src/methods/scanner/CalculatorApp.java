package methods.scanner;

import java.util.Scanner;

public class CalculatorApp {

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

    public int per(int a, int b){
        return a%b;
    }

    public static void main(String[] args) {

        Scanner obj =new Scanner(System.in);

        System.out.println("Please enter value of a: ");
        int a=obj.nextInt();

        System.out.println("Please enter value of b: ");
        int b=obj.nextInt();

        System.out.println("Please enter choice , 1-Add, 2- Sub , 3- Multi, 4 divide ");
        int choice=obj.nextInt();

        CalculatorApp cal=new CalculatorApp();
        if(choice==1){
            System.out.println("Addition of given number is : "+cal.add(a,b));
        }

        if (choice==2) {
            System.out.println("subtraction of given number is : " + cal.sub(a, b));
        }

        if (choice==3){
            System.out.println("multiplication of given number : "+ cal.multi(a,b));
        }

        if (choice==4){
            System.out.println("division of given number"+cal.div(a,b));
        }

        if (choice==5){
            System.out.println("percentage of given number : "+cal.per(a,b));
        }



    }
}
