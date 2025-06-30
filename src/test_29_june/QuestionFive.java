package test_29_june;

import java.util.Scanner;

public class QuestionFive
{
    public void divisibleBy8AndNotOdd()
    {
        System.out.println("Enter a value between 8 to 160, to check if it's divisible by 11 and should not be odd:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value >= 8 && value <= 160)
        {
            if (value % 11 == 0 && value % 2 == 0)
            {
                System.out.println(value + " is divisible by 11 and is even");
            }
            else if (value % 11 == 0 && value % 2 != 0)
            {
                System.out.println(value + " is divisible by 11 but is odd");
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
        QuestionFive questionFive = new QuestionFive();
        questionFive.divisibleBy8AndNotOdd();
    }
}
