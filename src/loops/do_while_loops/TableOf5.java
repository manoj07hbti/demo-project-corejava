package loops.do_while_loops;

public class TableOf5
{
    public static void main(String[] args)
    {
        int i = 1;
        int j = 5;
        do {
            System.out.println("5 X "+i+" = "+i*j);
            i++;
        }while (i <= 10);
    }
}
