package collections;

import java.util.ArrayList;

public class Elements20
{
    public ArrayList printingElements()
    {
        ArrayList arrayList = new ArrayList();
        arrayList.add("Max");
        arrayList.add("Steve");
        arrayList.add("Tommy");
        arrayList.add("Connor");
        arrayList.add("Mario");
        arrayList.add("Jack");
        arrayList.add("Ahab");
        arrayList.add("Simon");
        arrayList.add("Altair");
        arrayList.add("Ezio");
        arrayList.add("Kratos");
        arrayList.add("Arthur");
        arrayList.add("John");
        arrayList.add("Red");
        arrayList.add("Wolf");
        arrayList.add("Leon");
        arrayList.add("Chris");
        arrayList.add("Ethan");
        arrayList.add("Raiden");
        arrayList.add("Edward");

        return arrayList;
    }

    public static void main(String[] args)
    {
        Elements20 elements20 = new Elements20();
        ArrayList list = elements20.printingElements();

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println("Printing by For Loop, element " + i + ": " + list.get(i));
        }

        int k = 0;
        while (k < list.size())
        {
            System.out.println("Printing by While Loop, element " + k + ": " + list.get(k));
            k++;
        }

        int j = 0;
        do
        {
            System.out.println("Printing by Do While Loop, element " + j + ": " + list.get(j));
            j++;
        }
        while (j < list.size());

        for (Object arrayList: elements20.printingElements())
        {
            System.out.println("Printing by Advance/Enhance Loop:" + arrayList);
        }
    }
}
