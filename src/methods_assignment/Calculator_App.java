package methods_assignment;

public class Calculator_App {

    public void addition(){
        int a= 30;
        int b= 30;
        int add= a+b;
        System.out.println("sum of a and b is= "+add);
    }

    public void subtraction(){

        int a =95;
        int b =37;
        int sub = a-b;
        System.out.println("sum of a and b is= "+sub);
    }

    public void multiplication(){

        int a= 87;
        int b= 49;
        int multi= a*b;
        System.out.println("sum of a and b is= "+multi);
    }

    public void division(){

        int a =21;
        int b= 5;
        int div= a/b;
        System.out.println("sum of a and b is= "+div);
    }

    public static void main(String[] args) {
        Calculator_App obj= new Calculator_App();
        obj.addition();
        obj.subtraction();
        obj.multiplication();
        obj.division();
    }
}
