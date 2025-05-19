package test_18_may;

public class NotDivisibleBy3
{
    public static void main(String[] args)
    {
        int value = 6;

        if (value % 3 != 0)
        {
            System.out.println("Not divisible by 3..."+value);
        }
        else
        {
            System.out.println("Divisible by 3..."+value);
        }
    }
}
