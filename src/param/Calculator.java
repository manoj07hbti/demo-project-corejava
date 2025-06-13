package param;

public class Calculator {

    public void addition(int a,int b){

        int sum =a+b;
        System.out.println("Addition= "+sum);
    }

    public void subtract(int a,int b){

        int sub =a-b;
        System.out.println("subtraction= "+sub);
    }

    public void multiplication(int a, int b){

        int multi= a*b;
        System.out.println("multiplication= "+multi);
    }

    public void division(int a,int b){

        int div= a%b;
        System.out.println("division= "+div);
    }

    public static void main(String[] args) {
        Calculator obj= new Calculator();
        obj.addition(2,5);
        obj.addition(6,10);

        obj.subtract(18,8);
        obj.subtract(40,9);

        obj.multiplication(4,8);
        obj.multiplication(9,6);

        obj.division(15,6);
        obj.division(25,9);
    }
}
