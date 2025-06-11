package methods;

public class EvenOrOdd
{
    public void evenOddCheck()
    {
        int number = 34;

        if (number % 2 == 0)
        {
            System.out.println("The given number ("+ number +") is even");
        }
        else
        {
            System.out.println("The given number ("+ number +") is odd");
        }
    }

    public static void main(String[] args)
    {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        evenOrOdd.evenOddCheck();
    }
}
