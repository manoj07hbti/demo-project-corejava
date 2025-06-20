package test_16_june;

public class FindLowestElement
{
    public void lowestElement()
    {
        int values [] = {10,20,5,8};
        int lowestEl = values[0];

        for (int i: values)
        {
            if (i < lowestEl)
            {
                lowestEl = i;
            }
        }
        System.out.println("Lowest element is: "+lowestEl);
    }

    public static void main(String[] args)
    {
        FindLowestElement lowestElement = new FindLowestElement();
        lowestElement.lowestElement();
    }
}
