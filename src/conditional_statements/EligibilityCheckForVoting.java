package conditional_statements;

public class EligibilityCheckForVoting
{
    public static void main(String[] args)
    {
        int age = 20;
        if (age >= 18)
        {
            System.out.println("Eligible for voting...");
        }
        if (age < 18)
        {
            System.out.println("Not eligible for voting...");
        }
    }
}
