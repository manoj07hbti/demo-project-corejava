package return_type;

public class Factorial
{
    public int factorialFind(int value)
    {
        int factorial = 1;

        for (int i = value; i > 0; i--)
        {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args)
    {
        Factorial factorial = new Factorial();

        int output = factorial.factorialFind(5);
        System.out.println("Factorial of given value is "+output);
    }
}
