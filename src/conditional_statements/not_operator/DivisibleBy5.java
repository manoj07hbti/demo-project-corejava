package conditional_statements.not_operator;

public class DivisibleBy5
{
    public static void main(String[] args)
    {
        int value = 27;
        if (!(value % 5 != 0))
        {
            System.out.println("Value: "+value+" is divisible by 5...");
        }
        else
        {
            System.out.println("Value: "+value+" is not divisible by 5...");
        }
    }
}
