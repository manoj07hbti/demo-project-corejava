package method_scanner;

import java.util.Scanner;

public class Calculator_2 {

    public int add(int a , int b){

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

        Scanner obj =new Scanner(System.in);
        System.out.println("Please enter value of a: ");
        int a=obj.nextInt();
        System.out.println("Please enter value of a: ");
        int b=obj.nextInt();
        System.out.println("Please enter choice , 1-Add , 2-Subtract , 3-Multi, 4-divide ");
        int choice=obj.nextInt();

        Calculator_2 value =new Calculator_2();
        if(choice==1){
            System.out.println("Addition of given number is = "+value.add(a,b));
        }
        if(choice==2){
            System.out.println("subtract of given number is = "+value.sub(a,b));
        }
        if(choice==3){
            System.out.println("multiply of given number is = "+value.multi(a,b));
        }
        if(choice==4){
            System.out.println("division of given number is = "+value.div(a,b));
        }



    }
}

