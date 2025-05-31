package arrays;

public class Heights
{
    public static void main(String[] args)
    {
        double heights [] = {5.10, 5.8, 5.9, 5.11, 6.2, 6.1};

        for (int i = 0; i <= 5; i++)
        {
            System.out.println("Printing heights by using For Loop: "+heights[i]);
        }

        int i = 0;
        while (i <= 5)
        {
            System.out.println("Printing heights by using While Loop: "+heights[i]);
            i++;
        }

        int j = 0;
        do
        {
            System.out.println("Printing heights by using Do While Loop: "+heights[j]);
            j++;
        }
        while (j <= 5);

        for (double height: heights)
        {
            System.out.println("Printing heights by using Advance For Loop: "+height);
        }
    }
}
