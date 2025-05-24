package loops.do_while_loops;

public class Odd1To100
{
    public static void main(String[] args)
    {
        int i = 1;
        do
        {
            if (i % 2 != 0)
            {
                System.out.println("Odd number..."+i);
            }
            i++;
        }
        while (i <= 100);
    }
}
