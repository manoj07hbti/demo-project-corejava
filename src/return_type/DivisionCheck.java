package return_type;

public class DivisionCheck
{
    public int division(int totalMarks)
    {
        if (totalMarks >= 33 && totalMarks < 60)
        {
            System.out.println("Third division: "+totalMarks);
        }
        if (totalMarks >= 60 && totalMarks <= 75)
        {
            System.out.println("Second division: "+totalMarks);
        }
        if (totalMarks > 75)
        {
            System.out.println("First division: "+totalMarks);
        }
        if (totalMarks < 33)
        {
            System.out.println("Failed: "+totalMarks);
        }
        return totalMarks;
    }

    public static void main(String[] args)
    {
        DivisionCheck divisionCheck = new DivisionCheck();
        int output = divisionCheck.division(56);
    }
}
