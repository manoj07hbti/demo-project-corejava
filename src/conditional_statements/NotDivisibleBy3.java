package conditional_statements;

public class NotDivisibleBy3
{
    public static void main(String[] args)
    {
        int value = 18;
        if (value % 3 != 0)
        {
            System.out.println("Given number is not divisible by 3...");
        }
        else
        {
            System.out.println("Given number is divisible by 3...");
        }
    }
}
