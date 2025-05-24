package loops.do_while_loops;

public class Even1To100
{
    public static void main(String[] args)
    {
        int i = 1;
        do
        {
            if (i % 2 == 0)
            {
                System.out.println("Even number..."+i);
            }
            i++;
        }
        while (i <= 100);
    }
}
