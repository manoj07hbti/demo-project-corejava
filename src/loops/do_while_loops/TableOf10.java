package loops.do_while_loops;

public class TableOf10
{
    public static void main(String[] args)
    {
        int i = 1;
        int j = 10;
        do {
            System.out.println("10 X "+i+" = "+i*j);
            i++;
        }while (i <= 10);
    }
}
