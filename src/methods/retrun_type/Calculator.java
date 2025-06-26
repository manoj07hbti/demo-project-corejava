package methods.retrun_type;

import java.util.concurrent.Callable;

public class Calculator {

    public int add(int a ,int b) {

        return a+b;
    }

    public int sub(int a , int b){

        return a-b;
    }


    public int mul(int a , int b){

        return a*b;
    }

    public double div(int a , int b){

        return (double) a/b;
    }

    public static void main(String[] args) {

       Calculator obj=new Calculator();

       int sum=obj.add(9,4);

        System.out.println("Aaddition is : "+sum);

        int sub=obj.sub(34,24);

        System.out.println("Subtraction is : "+sub);

        int multi=obj.mul(5,8);

        System.out.println("Multiplication is : "+multi);

        double div=obj.div(9,4);

        System.out.println("Division is : "+div);

    }


}