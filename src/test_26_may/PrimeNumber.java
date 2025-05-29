package test_26_may;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        int number = 5;
        boolean flag = true;

        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                flag = false;
            }
            else
            {
            }
        }
        if (flag)
        {
            System.out.println("Number is prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
}
