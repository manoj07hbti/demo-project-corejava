package conditional_statements.not_operator;

public class NationalityCheck
{
    public static void main(String[] args)
    {
        String nationality = "American";
        if (!(nationality == "India"))
        {
            System.out.println("You're not Indian...");
        }
        else
        {
            System.out.println("You're are Indian...");
        }
    }
}
