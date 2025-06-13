package assignment_methods_and_call;

import java.util.concurrent.Callable;

public class CalculatorApp {

    //Calculator App:
    //add, sub, divide and multi
    public void calculation(){
        int a=8;
        int b=2;
        int sum=a+b;
        System.out.println("printing sum of a and b----->"+sum);
        int sub=a-b;
        System.out.println("printing subtraction of a and b----->"+sub);
        double div=a/b;
        System.out.println("printing division of a and b----->"+div);
        int multi=a*b;
        System.out.println("printing multiplication of a and b----->"+multi);
    }

    public static void main(String[] args) {
        CalculatorApp obj1=new CalculatorApp();
        obj1.calculation();
    }
}
