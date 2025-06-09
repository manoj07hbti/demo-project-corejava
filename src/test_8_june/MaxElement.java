package test_8_june;

public class MaxElement
{
    public static void main(String[] args)
    {
        int values [] = {1,3,5,2,4};
        int maxValue = values[0];

        for (int i: values)
        {
            if (i > maxValue)
            {
                maxValue = i;
            }
        }
        System.out.println("Maximum element is: "+maxValue);
    }
}
