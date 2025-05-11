package conditional_statements;

public class ExamPassOrNot
{
    public static void main(String[] args)
    {
        int marks = 65;
        if (marks >= 33)
        {
            System.out.println("The candidate has passed...");
        }
        if (marks < 33)
        {
            System.out.println("The candidate has failed...");
        }
    }
}
