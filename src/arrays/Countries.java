package arrays;

public class Countries
{
    public static void main(String[] args)
    {
        String countries [] = {"India","Japan","Deutschland","China","Russia","United States of America"};

        for (int i = 0; i <= 5; i++)
        {
            System.out.println("Printing countries by using For Loop: "+countries[i]);
        }

        int i = 0;
        while (i <= 5)
        {
            System.out.println("Printing countries by using While Loop: "+countries[i]);
            i++;
        }

        int j = 0;
        do
        {
            System.out.println("Printing countries by using Do While Loop: "+countries[j]);
            j++;
        }
        while (j <= 5);

        for (String country: countries)
        {
            System.out.println("Printing countries by using Advance For Loop: "+country);
        }
    }
}
