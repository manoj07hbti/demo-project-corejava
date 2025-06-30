package test_29_june;

public class QuestionFour
{
    public void cubeList()
    {
        for (int i = 1; i <= 10; i++)
        {
            int cube = i*i*i;
            if (i == 10)
            {
                System.out.print(cube);
            }
            else
            {
                System.out.print(cube + ", ");
            }
        }
    }

    public static void main(String[] args)
    {
        QuestionFour questionFour = new QuestionFour();
        questionFour.cubeList();
    }
}
