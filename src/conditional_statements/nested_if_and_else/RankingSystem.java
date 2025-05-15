package conditional_statements.nested_if_and_else;

public class RankingSystem
{
    public static void main(String[] args)
    {
        int percentage = 96;
        if (percentage >= 33)
        {
            if (percentage >= 33 && percentage < 60)
            {
                System.out.println("Second division..."+percentage+"%");
            }
            if (percentage >= 60 && percentage < 75)
            {
                System.out.println("First division..."+percentage+"%");
            }
            if (percentage >= 75)
            {
                System.out.println("Gold medalist..."+percentage+"%");
            }
        }
        else
        {
            System.out.println("No rank..."+percentage+"%");
        }
    }
}
