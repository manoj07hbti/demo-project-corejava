package test_16_june;

public class CountEvenAndOdd
{
    public void evenOdd()
    {
        int arr [] = {1, 2, 3, 4, 5, 6};
        int evenValues = 0;
        int oddValues = 0;

        for (int i: arr)
        {
            if (i % 2 == 0)
            {
                evenValues++;
            }
            else
            {
                oddValues++;
            }
        }
        System.out.println("Even values: "+evenValues+", Odd values: "+oddValues);
    }

    public static void main(String[] args)
    {
        CountEvenAndOdd countEvenAndOdd = new CountEvenAndOdd();
        countEvenAndOdd.evenOdd();
    }
}
