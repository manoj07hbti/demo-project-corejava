package return_type;

public class BasicCalculator
{
    public int addition(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    public int subtraction(int a, int b)
    {
        int sum = a-b;
        return sum;
    }
    public int multiplication(int a, int b)
    {
        int sum = a*b;
        return sum;
    }
    public double division(int a, int b)
    {
        int sum = a/b;
        return (double) sum;
    }

    public static void main(String[] args)
    {
        BasicCalculator basicCalculator = new BasicCalculator();

        int output;
        double division;

        output = basicCalculator.addition(5,5);
        System.out.println("After adding: "+output);

        output = basicCalculator.subtraction(6,5);
        System.out.println("After subtracting: "+output);

        output = basicCalculator.multiplication(5,5);
        System.out.println("After multiplying: "+output);

        division = basicCalculator.division(56,5);
        System.out.println("After dividing: "+division);
    }
}
