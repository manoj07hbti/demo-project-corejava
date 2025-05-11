package conditional_statements;

public class NationalityCheck
{
    public static void main(String[] args)
    {
        String nationality = "India";
        if (nationality == "India")
        {
            System.out.println("The candidate is from India...");
        }
        if (nationality != "India")
        {
            System.out.println("The candidate is not from India...");
        }
    }
}
