package test_29_june;

public class QuestionTwo
{
    public void squareList()
    {
        for (int i = 1; i <= 10; i++)
        {
            int square = i * i;
            if (i == 10)
            {
                System.out.print(square);
            }
            else
            {
                System.out.print(square + ", ");
            }
        }
    }

    public static void main(String[] args)
    {
        QuestionTwo questionTwo = new QuestionTwo();
        questionTwo.squareList();
    }
}
