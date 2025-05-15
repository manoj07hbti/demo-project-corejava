package conditional_statements.nested_if_and_else;

public class AgeGpCheck
{
    public static void main(String[] args)
    {
        int age =24;
        if (age >= 0)
        {
            if (age >= 0 && age <= 18)
            {
                System.out.println("Child..." + age);
            }
            if (age >= 18 && age <= 40)
            {
                System.out.println("Young..." + age);
            }
            if (age >= 60)
            {
                System.out.println("Old age..." + age);
            }
        }
        else
        {
            System.out.println("Out of range...");
        }
    }
}
