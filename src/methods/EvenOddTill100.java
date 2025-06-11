package methods;

public class EvenOddTill100
{
    public void evenOddHundred()
    {
        for (int i = 1; i <= 100; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("Printing even value: "+i);
            }
            if (i % 2 != 0)
            {
                System.out.println("Printing odd value: "+i);
            }
        }
    }

    public static void main(String[] args)
    {
        EvenOddTill100 evenOddTill100 = new EvenOddTill100();
        evenOddTill100.evenOddHundred();
    }
}
