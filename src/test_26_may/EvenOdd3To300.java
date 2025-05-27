package test_26_may;

public class EvenOdd3To300
{
    public static void main(String[] args)
    {
        for (int i = 3; i <= 300; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("Even number..."+i);
            }
            if (i % 2 != 0)
            {
                System.out.println("Odd number..."+i);
            }
        }
    }
}
