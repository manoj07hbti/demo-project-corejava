package return_type;

public class PrimeNumber
{
    public int primeNumberCheck(int value)
    {
        boolean flag = true;
        for (int i = 2; i < value; i++)
        {
            if (value % i == 0)
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
        return value;
    }

    public static void main(String[] args)
    {
        PrimeNumber primeNumber = new PrimeNumber();
        int output = primeNumber.primeNumberCheck(6);
    }
}
