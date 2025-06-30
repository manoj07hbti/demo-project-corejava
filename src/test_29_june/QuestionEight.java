package test_29_june;

import java.util.Scanner;

public class QuestionEight
{
    public void primeNumberCheck()
    {
        System.out.println("Enter a number between 10 to 20 to check if it's prime or not");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean flag = true;

        if (number >= 10 && number <= 20)
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
        QuestionEight questionEight = new QuestionEight();
        questionEight.primeNumberCheck();
    }
}
