package exception;

public class Demo_ArithmeticException {

    public void divideNumber(int a, int b){
        try {
            System.out.println("Before Divide.......");
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!"+e);
        }
        System.out.println(" After Divide...");
    }

    public static void main(String[] args) {
        Demo_ArithmeticException obj = new Demo_ArithmeticException();
        obj.divideNumber(10,0);
    }
}
