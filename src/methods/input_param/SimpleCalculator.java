package methods.input_param;

public class SimpleCalculator
{
    public void addition(int a, int b)
    {
        int sum = a+b;
        System.out.println("Sum after adding "+ a +" and "+ b +" is: "+ sum);
    }

    public void subtraction(int a, int b)
    {
        int sum = b-a;
        System.out.println("Sum after subtracting "+ a +" from "+ b +" is: "+ sum);
    }

    public void multiplication(int a, int b)
    {
        int sum = a*b;
        System.out.println("Sum after multiplying "+ a +" into "+ b +" is: "+ sum);
    }

    public void division(int a, int b)
    {
        int sum = b/a;
        System.out.println("Sum after dividing "+ b +" by "+ a +" is: "+ sum);
    }

    public static void main(String[] args)
    {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.addition(5,5);
        simpleCalculator.subtraction(5,6);
        simpleCalculator.multiplication(5,5);
        simpleCalculator.division(5,30);
    }
}
