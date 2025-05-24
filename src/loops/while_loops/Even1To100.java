package loops.while_loops;

public class Even1To100
{
    public static void main(String[] args)
    {
        int i = 1;
        while (i <= 100)
        {
            if (i % 2 == 0)
            {
                System.out.println("Even number..."+i);
            }
            i++;
        }
    }
}
