package conditional_statements;

public class VotingSystem
{
    public static void main(String[] args)
    {
        int age = 18;
        if (age >= 18)
        {
            System.out.println("Welcome to the Voting System");
        }
        else
        {
            System.out.println("You're not eligible to vote, as your age is " + age);
        }
    }
}
