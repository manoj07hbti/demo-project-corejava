package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ScannerAndList
{
    public ArrayList addingNames()
    {
        ArrayList arrayList = new ArrayList();
        System.out.println("Enter 10 names: ");
        for (int i = 0; i <= 10; i++)
        {
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            arrayList.add(name);
        }
        return arrayList;
    }

    public static void main(String[] args)
    {
        ScannerAndList scannerAndList = new ScannerAndList();
        ArrayList arrayList = scannerAndList.addingNames();

        for (int i = 0; i <= 10; i++)
        {
            System.out.println("Printing names by For Loop: " + arrayList.get(i));
        }

        int j = 0;
        while (j <= 10)
        {
            System.out.println("Printing names by While Loop: " + arrayList.get(j));
            j++;
        }

        int k = 0;
        do
        {
            System.out.println("Printing names by Do While Loop: " + arrayList.get(k));
            k++;
        }
        while (k <= 10);

        for (Object names: scannerAndList.addingNames())
        {
            System.out.println("Printing names by Advance/Enhance Loop: "+names);
        }
    }
}
