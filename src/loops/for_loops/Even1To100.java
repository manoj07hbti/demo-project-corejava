package loops.for_loops;

public class Even1To100
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 100; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("Even number..."+i);
            }
        }
    }
}
