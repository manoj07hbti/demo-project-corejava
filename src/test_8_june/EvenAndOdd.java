package test_8_june;

public class EvenAndOdd
{
    public static void main(String[] args)
    {
        int numbers [] = {1, 2, 3, 4, 5, 6};
        int evens = 0;
        int odds = 0;

        for (int i: numbers)
        {
            if (i % 2 == 0)
            {
                evens++;
            }
            else
            {
                odds++;
            }
        }
        System.out.println("Even count: "+evens);
        System.out.println("Odd count: "+odds);
    }
}
