package methods;

public class EligibleForVoting
{
    public void eligibilityCheck()
    {
        int age = 22;

        if (age >= 18)
        {
            System.out.println("You're eligible for voting :)");
        }
        else
        {
            System.out.println("You're not eligible for voting :(");
        }
    }

    public static void main(String[] args)
    {
        EligibleForVoting eligibleForVoting = new EligibleForVoting();
        eligibleForVoting.eligibilityCheck();
    }
}
