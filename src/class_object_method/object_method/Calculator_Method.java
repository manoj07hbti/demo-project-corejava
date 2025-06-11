package class_object_method.object_method;

public class Calculator_Method {

    //Calculator App:
    //
    //add, sub , divide and multi

    public void addition() {
        int a = 18;
        int b = 56;
        int sum = a + b;

        System.out.println("Sum of Given Number :" + sum);
    }


    public void subtract() {
        int a = 49;
        int b = 27;
        int subtract = a - b;

        System.out.println("Subtraction of Given Number :" + subtract);
    }


    public void multiply() {
        int a = 49;
        int b = 27;
        int multiplication = a * b;

        System.out.println("Multiplication of Given Number :" + multiplication);
    }

    public void divide() {
        double a = 49;
        double b = 5;
        double ans = a / b;

        System.out.println("Divisible of two Number :" + ans);
    }


    public static void main(String[] args) {

        Calculator_Method add1 = new Calculator_Method();
        add1.addition();

        Calculator_Method sub = new Calculator_Method();
        sub.subtract();

        Calculator_Method multiply = new Calculator_Method();
        multiply.multiply();

        Calculator_Method divide = new Calculator_Method();
        divide.divide();

    }


}