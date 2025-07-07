package collections.generics;

import java.util.ArrayList;
import java.util.Scanner;

public class Populations
{
    public ArrayList <Long> addingPopulations()
    {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList <Long> countriesPopulations = new ArrayList<>();

        while (flag)
        {
            System.out.println("Enter populations (In Numbers):");
            Long population = scanner.nextLong();
            scanner.nextLine();
            countriesPopulations.add(population);

            System.out.println("Press 'Y' to continue or press any other key to exit:");
            String choice = scanner.nextLine();
            if (!(choice.equalsIgnoreCase("Y")==true))
            {
                flag = false;
            }
        }
        return countriesPopulations;
    }

    public static void main(String[] args)
    {
        Populations populations = new Populations();
        ArrayList <Long> output = populations.addingPopulations();
        System.out.println("Printing populations: "+output);
    }
}
