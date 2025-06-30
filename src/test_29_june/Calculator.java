package test_29_june;

import andopreator.SwitchAndCase;
import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Calculator {

    public int add(int num1, int num2){

        int sum =num1+num2;
        return sum;

    }
    public int sub(int num1, int num2) {

        int sub = num1 + num2;
        return sub;
    }
    public int multi(int num1, int num2) {

        int multi = num1 + num2;
        return multi;
    }
    public int divide(int num1, int num2) {

        int div = num1 + num2;
        return div;
    }

    public static void main(String[] args) {
        String flag = "T";
        Scanner obj =new Scanner(System.in);
        Calculator allOperations= new Calculator();
        while (flag.equals("T")){

            System.out.println("please enter value of number 1");
            int a= obj.nextInt();
            System.out.println("please enter value of number 2");
            int b= obj.nextInt();
            System.out.println("please enter your choice 3 - addition, 6 - subtraction , 9 - multiply and 12 - divide");
            int choice= obj.nextInt();

            if (choice==3){
                System.out.println("addition of given number is ="+allOperations.add(a,b));
            }
            if(choice==6){
                System.out.println("Addition of given number is : "+allOperations.sub(a,b));
            }
            if(choice==9){
                System.out.println("Addition of given number is : "+allOperations.multi(a,b));
            }
            if(choice==12){
                System.out.println("Addition of given number is : "+allOperations.divide(a,b));
            }

            Scanner obj2= new Scanner(System.in);
            System.out.println("press T to continue or press any key to exit ");
            flag= obj2.nextLine();
            if(!flag.equals("T")){
                System.out.println("Exit .. Thanks for using calculator ");
                break;
            }




        }
    }


}
