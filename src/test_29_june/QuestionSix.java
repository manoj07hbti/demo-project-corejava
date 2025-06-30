package test_29_june;

import java.util.Scanner;

public class QuestionSix
{
    public void primeNumberCheck()
    {
        System.out.println("Enter a number between 1 to 10 to check if it's prime or not");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean flag = true;

        if (number >= 1 && number <= 10)
        {
            for (int i = 2; i < number; i++)
            {
                if (number % i == 0)
                {
                    flag = false;
                }
            }
            if (flag)
            {
                System.out.println("Number is prime");
            }
            else
            {
                System.out.println("Number is not prime");
            }
        }
        else
        {
            System.out.println("Invalid Value");
        }
    }

    public static void main(String[] args)
    {
        QuestionSix questionSix = new QuestionSix();
        questionSix.primeNumberCheck();
    }
}
