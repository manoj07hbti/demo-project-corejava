package method_return_type;

public class Calculator {

    public int Addition(int a, int b) {

        int add = a + b;
        return add;
    }

    public int Subtract(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public int Multiply(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public int Division(int a, int b) {
        int div = a / b;
        return div;
    }

    public static void main(String[] args) {
        Calculator obj= new Calculator();

        int number= obj.Addition(10,2);
        System.out.println("10+2= "+number);

        number= obj.Subtract(10,8);
        System.out.println("10-8= "+number);

        number= obj.Multiply(13,5);
        System.out.println("13*5= "+number);

        number= obj.Division(20,3);
        System.out.println("20/3= "+number);
    }
}



