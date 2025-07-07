package collections.generics;

import java.util.ArrayList;
import java.util.Scanner;

public class Salaries
{
    public ArrayList <Double> addingSalaries()
    {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList <Double> salariesCount = new ArrayList<>();

        while (flag)
        {
            System.out.println("Enter salary here:");
            Double salary = scanner.nextDouble();
            scanner.nextLine();
            salariesCount.add(salary);

            System.out.println("Press 'Y' to continue or press any other key to exit:");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("Y")==true)
            {
                flag = false;
            }
        }
        return salariesCount;
    }

    public static void main(String[] args)
    {
        Salaries salaries = new Salaries();
        ArrayList <Double> output = salaries.addingSalaries();
        System.out.println("Printing salaries: "+output);

    }
}
