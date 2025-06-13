package methods.input_param;

public class PrimeNumberCheck
{
    public void primeNumberOrNot(int number)
    {
        boolean flag = true;
        for(int i = 2; i < number; i++)
        {
            if(number % i == 0)
            {
                flag = false;
            }else
            {
            }
        }
        if (flag)
        {
            System.out.println("The given number "+ number +" is a prime number");
        }else
        {
            System.out.println("The given number "+ number +" is not a prime number");
        }
    }

    public static void main(String[] args)
    {
        PrimeNumberCheck primeNumberCheck = new PrimeNumberCheck();
        primeNumberCheck.primeNumberOrNot(6);
    }
}
