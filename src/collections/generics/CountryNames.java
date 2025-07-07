package collections.generics;

import java.util.ArrayList;
import java.util.Scanner;

public class CountryNames
{
    public ArrayList <String> addingCountries()
    {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList <String> countryNames = new ArrayList<>();

        while (flag)
        {
            System.out.println("Enter a country:");
            String country = scanner.nextLine();
            countryNames.add(country);
            System.out.println("Press 'Y' to continue or press any other key to exit:");
            String choice = scanner.nextLine();
            if (!(choice.equalsIgnoreCase("Y")==true))
            {
                flag = false;
            }
        }
        return countryNames;
    }

    public static void main(String[] args)
    {
        CountryNames countryNames = new CountryNames();
        ArrayList <String> output = countryNames.addingCountries();
        System.out.println("Printing countries: "+output);
    }
}
