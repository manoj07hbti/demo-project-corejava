package methods.input_param;

public class Factorial
{
    public void factorialFinder(int number)
    {
        int factorial = 1;
        for (int i = number; i > 0; i--)
        {
            factorial *= i;
        }
        System.out.println("The factorial of "+ number +" is: "+factorial);
    }

    public static void main(String[] args)
    {
        Factorial factorial = new Factorial();
        factorial.factorialFinder(5);
        factorial.factorialFinder(3);
        factorial.factorialFinder(4);
    }
}
