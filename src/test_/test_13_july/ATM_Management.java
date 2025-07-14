package test_.test_13_july;

import java.util.Scanner;

public class ATM_Management {

    int pin = 3333;
    int totalBalance = 50000;

//==================================================================================//

    //  Method to check balance
    public void checkBalance(){
        System.out.println("\n Your Current Balance.."+totalBalance+" INR ");
    }

 //==================================================================================//

    // Method for cash withdrawal
    public void cashWithdrawal() {
        System.out.print("Enter amount to withdraw (multiple of 100): ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if (amount % 100 != 0) {
            System.out.println("Error: Please enter a valid amount (multiple of 100).");
        } else if (amount > totalBalance) {
            System.out.println("Insufficient balance.");
        } else {
            totalBalance -= amount;
            System.out.println("Please collect your cash.");
        }
    }


 //===============================================================================================//

    // Method for Cash Deposit
    public void depositCashAmount() {
        System.out.print("Enter amount to deposit: ");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        if (amount <= 0) {
             System.out.println("Error: Enter a valid amount to deposit.");
        } else {
            totalBalance += amount;
            System.out.println("Amount deposited successfully. :"+totalBalance);
        }
    }

 //==============================================================================================
    //Method for Exit Application
    public void exitApplication()
    {
        System.out.println("Thank you for using XYZ Bank ATM. Goodbye!");
    }
//===========================================================================
    public static void main(String[] args) {

        ATM_Management atm=new ATM_Management();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to XYZ Bank ATM");
        System.out.print("Please enter your PIN: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin == atm.pin)
        {
            String flag = "Y";

            while (flag.equalsIgnoreCase("Y"))
            {
                System.out.println("\n===== ATM Menu =====");// display the ATM menu
                System.out.println("1. Cash Withdrawal");
                System.out.println("2. Balance Check");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();  //=========handle user choice=================

                switch (choice)
                {
                    case 1:
                        atm.cashWithdrawal();
                        break;
                    case 2:
                        atm.checkBalance();
                        break;
                    case 3:
                        atm.depositCashAmount();
                        break;
                    case 4:
                        atm.exitApplication();
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
                System.out.println("Press Y to continue or any other key to exit");
                flag = scanner.next();
            }
        }else{
            System.out.println("Incorrect PIN. Access Denied.");
        }
    }
}
