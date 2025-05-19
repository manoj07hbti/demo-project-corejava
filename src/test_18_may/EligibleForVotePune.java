package test_18_may;

public class EligibleForVotePune
{
    public static void main(String[] args)
    {
        String city = "Pune";
        int age = 22;

        if (age >= 18 && city == "Pune")
        {
            System.out.println("Eligible for vote in Pune...");
        }
        else
        {
            System.out.println("Not eligible for vote in Pune...");
        }
    }
}
