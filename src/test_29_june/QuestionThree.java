package test_29_june;

import java.util.Scanner;

public class QuestionThree
{
    public void divisibleBy9AndNotOdd()
    {
        System.out.println("Enter a value between 3 to 160, to check if it's divisible by 9 and should not be odd:");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if (value >= 3 && value <= 160)
        {
            if (value % 9 == 0 && value % 2 == 0)
            {
                System.out.println(value + " is divisible by 9 and is even");
            }
            else if (value % 9 == 0 && value % 2 != 0)
            {
                System.out.println(value + " is divisible by 9 but is odd");
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
        QuestionThree questionThree = new QuestionThree();
        questionThree.divisibleBy9AndNotOdd();
    }
}
