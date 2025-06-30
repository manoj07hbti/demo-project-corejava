package test_29_june;

import java.util.Scanner;

public class QuestionOne
{
    public void divisibleBy7AndNotOdd()
    {
        System.out.println("Enter a value between 7 to 190, to check if it's divisible by 7 and should not be odd:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value >= 7 && value <= 190)
        {
            if (value % 7 == 0 && value % 2 == 0)
            {
                System.out.println(value + " is divisible by 7 and is even");
            }
            else if (value % 7 == 0 && value % 2 != 0)
            {
                System.out.println(value + " is divisible by 7 but is odd");
            }
            else
            {
                System.out.println(value + " doesn't match any condition");
            }
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args)
    {
        QuestionOne questionOne = new QuestionOne();
        questionOne.divisibleBy7AndNotOdd();
    }
}
