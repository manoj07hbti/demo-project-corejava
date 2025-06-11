package methods;

public class SimpleCalculator
{
    public void addition()
    {
        int a = 5; int b = 6;
        int total = a + b;

        System.out.println("The sum of adding "+ a +" and "+ b +" is: "+ total);
    }
    public void subtraction()
    {
        int a = 6; int b = 5;
        int total = a-b;

        System.out.println("The sum of subtracting "+ b +" from "+ a +" is: "+ total);
    }
    public void multiplication()
    {
        int a = 6; int b = 6;
        int total = a*b;

        System.out.println("The sum of multiplying "+ a +" into "+ b +" is: "+ total);
    }
    public void division()
    {
        int a = 5; int b = 25;
        int total = a%b;

        System.out.println("The sum of division "+ b +" by "+ a +" is: "+total);
    }

    public static void main(String[] args)
    {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.addition();
        simpleCalculator.subtraction();
        simpleCalculator.multiplication();
        simpleCalculator.division();
    }
}
