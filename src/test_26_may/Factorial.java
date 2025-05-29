package test_26_may;

public class Factorial
{
    public static void main(String[] args)
    {
        int value = 6;
        int factorial = 1;

        for (int i = value; i > 0; i--)
        {
            factorial *= i;
        }
        System.out.println("Factorial of "+value+" is: "+factorial);
    }
}
