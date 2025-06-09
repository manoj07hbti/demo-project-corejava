package test_8_june;

public class SumOfArray
{
    public static void main(String[] args)
    {
        int values [] = {1,2,3,4,5};
        int sum = 0;

        for (int value: values)
        {
            sum += value;
        }

        System.out.println("The sum of the array is: "+sum);
    }
}
