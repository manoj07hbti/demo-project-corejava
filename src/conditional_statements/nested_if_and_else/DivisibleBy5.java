package conditional_statements.nested_if_and_else;

public class DivisibleBy5
{
    public static void main(String[] args)
    {
        int value = 65;
        if (value >= 0)
        {
            if (value % 5 == 0)
            {
                System.out.println("The given value is divisible by 5..."+value);
            }
            else
            {
                System.out.println("The given value is not divisible by 5..."+value);
            }
        }
        else
        {
            System.out.println("The given value is not greater than 0..."+value);
        }
    }
}
