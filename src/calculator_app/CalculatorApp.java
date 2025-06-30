package calculator_app;

import java.util.Scanner;

public class CalculatorApp {

    //Write a calculator App with Scanner
    //ask user for choice :1 for percentage, 5 for addition 10 for subtraction , 15 - for multiply and 20 for divide

    public double percentage(int a,int b){
       return (double) (a/b)*100;
    }

    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int multi(int a,int b){
        return a*b;
    }
    public double div(int a,int b){
        return (double) a/b;
    }

    public static void main(String[] args) {

     String flag="N";
        Scanner obj=new Scanner(System.in);
        CalculatorApp app=new CalculatorApp();
        while (flag.equals("N")){

            System.out.println("please enter the value of A");
            int a=obj.nextInt();
            System.out.println("please enter the value of B");
            int b=obj.nextInt();
            System.out.println("enter choice 1 for percentage, 5 for addition 10 for subtraction , 15 - for multiply and 20 for divide");
            int choice=obj.nextInt();
            if (choice==1){
                System.out.println("percentage of A and B is= "+app.percentage(a,b));
            }
            if (choice==5){
                System.out.println("addition of A and B is= "+app.add(a,b));
            }
            if (choice==10){
                System.out.println("subtraction of A and B is= "+app.sub(a,b));
            }
            if (choice==15){
                System.out.println("multiplication of A and B is= "+app.multi(a,b));
            }
            if (choice==20){
                System.out.println("division of A and B is= "+app.div(a,b));
            }
            Scanner obj2=new Scanner(System.in);
            System.out.println("press N to continue or any other key to exit");
            flag=obj.nextLine();
            if (!flag.equals("N")){
                break;
            }
        }

    }
}
