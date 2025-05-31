package arrays;

public class Distances
{
    public static void main(String[] args)
    {
        int distances [] = {2, 4, 6, 8, 10};

        for (int i = 0; i <= 4; i++)
        {
            System.out.println("Printing distances by using For Loop: "+distances[i]);
        }

        int i = 0;
        while (i <= 4)
        {
            System.out.println("Printing distances by using While Loop: "+distances[i]);
            i++;
        }

        int j = 0;
        do
        {
            System.out.println("Printing distances by using Do While Loop: "+distances[j]);
            j++;
        }
        while (j <= 4);

        for (int distance: distances)
        {
            System.out.println("Printing distances by using Advance For Loop: "+distance);
        }
    }
}
