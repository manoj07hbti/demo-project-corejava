package conditional_statements.not_operator;

public class EvenOrOdd
{
    public static void main(String[] args)
    {
        int value = 7;
        if (!(value % 2 != 0))
        {
            System.out.println("The given value is even... Value: "+value);
        }
        else
        {
            System.out.println("The given value is odd... Value: "+value);
        }
    }
}
