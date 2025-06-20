package return_type;

public class EvenOrOdd
{
    public int evenOrOddCheck(int value)
    {
        if (value % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        return value;
    }

    public static void main(String[] args)
    {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        int output = evenOrOdd.evenOrOddCheck(5);
    }
}
