package test_13_july;

import java.util.Scanner;

public class BankingSystem
{
    int pin = 3333;
    int totalBalance = 50000;

    public void cashWithdraw() {
        System.out.println("Enter the withdrawing amount (Amount should be multiplied by 100) :");
        Scanner scanner = new Scanner(System.in);
        int withdrawAmount = scanner.nextInt();

        if (withdrawAmount % 100 != 0)
        {
            System.out.println("Please enter amount in multiples of 100.");
        }
        else if (withdrawAmount > totalBalance)
        {
            System.out.println("Insufficient balance.");
        }
        else
        {
            totalBalance -= withdrawAmount;
            System.out.println("Operation completed, your total balance is: " + totalBalance);
        }
    }


    public void balanceCheck()
    {
        System.out.println("Operation completed, your total balance is: " + totalBalance + " INR");
    }

    public void cashDeposit()
    {
        System.out.println("Enter the depositing amount:");
        Scanner scanner = new Scanner(System.in);
        int depositAmount = scanner.nextInt();

        if (depositAmount > 0)
        {
            totalBalance += depositAmount;
            System.out.println("Operation completed, your total balance is: " + totalBalance + "INR");
        }
    }

    public void exitApplication()
    {
        System.out.println("Exiting...");
    }

    public static void main(String[] args)
    {
        BankingSystem atm = new BankingSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to XYZ Bank ATM, please enter your PIN:");
        int enteredPin = scanner.nextInt();

        if (enteredPin == atm.pin)
        {
            String flag = "Y";

            while (flag.equalsIgnoreCase("Y"))
            {
                System.out.println("1- Withdraw Cash, 2- Balance Check, 3- Deposit Cash, 4- Exit");
                int choice = scanner.nextInt();

                switch (choice)
                {
                    case 1:
                        atm.cashWithdraw();
                        break;
                    case 2:
                        atm.balanceCheck();
                        break;
                    case 3:
                        atm.cashDeposit();
                        break;
                    case 4:
                        atm.exitApplication();
                        return;
                }
                System.out.println("Press Y to continue or any other key to exit");
                flag = scanner.next();
            }
        }
        else
        {
            System.out.println("Invalid PIN, please try again...");
        }
    }
}
