package scanner;

import java.util.Scanner;

public class ATMLogin {

    public int pin = 5555;
    public int totalBalance = 50000;
    public long mobileNumber = 7465041564L;

    public void cashWithdraw()
    {
        System.out.println("Enter the withdrawing amount:");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if (amount <= totalBalance)
        {
            totalBalance -= amount;
            System.out.println(amount + " INR withdrawn. New balance: " + totalBalance);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }

    public void balanceCheck()
    {
        System.out.println("Your total balance is: " + totalBalance + " INR");
    }

    public void changePin()
    {
        System.out.println("Enter current PIN:");
        Scanner scanner = new Scanner(System.in);
        int currentPIN = scanner.nextInt();

        if (currentPIN == pin)
        {
            System.out.println("Enter new PIN:");
            int newPIN = scanner.nextInt();
            pin = newPIN;
            System.out.println("PIN changed successfully");
        }
        else
        {
            System.out.println("Invalid current PIN");
        }
    }

    public void changeMobile()
    {
        System.out.println("Enter your mobile number:");
        Scanner scanner = new Scanner(System.in);
        int mobile = scanner.nextInt();

        if (mobileNumber == mobile)
        {
            System.out.println("Enter your new mobile number:");
            Scanner scanner1 = new Scanner(System.in);
            long newMobile = scanner1.nextLong();
            mobileNumber = newMobile;
            System.out.println("Your mobile number changed successfully: "+newMobile);
        }
        else
        {
            System.out.println("Entered wrong mobile number");
        }
    }

    public static void main(String[] args)
    {
        ATMLogin atm = new ATMLogin();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to our ATM. Please enter your PIN:");
        int enteredPin = scanner.nextInt();

        if (enteredPin != atm.pin)
        {
            System.out.println("Invalid PIN");
            return;
        }

        String flag = "Y";

        while (flag.equalsIgnoreCase("Y"))
        {
            System.out.println("1- Cash Withdraw, 2- Balance Check, 3- Change PIN, 4- Change Mobile Number");
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
                    atm.changePin();
                    break;
                case 4:
                    atm.changeMobile();
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }

            System.out.println("Press Y to continue or any other key to exit");
            flag = scanner.next();
        }
    }
}
