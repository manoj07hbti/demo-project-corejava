package conditional_statements;

public class EligibilityCheck
{
    public static void main(String[] args)
    {
        int age = 15;
        if (age >= 18)
        {
            System.out.println("You're eligible for a driving license :)");
        }
        if (age < 18)
        {
            System.out.println("You're not eligible for a driving license :(");
        }
    }
}
