package test_13_july;

import java.util.Scanner;

public class AtmApp {

    int balance = 10000;

    public void cashWithdrawal(Scanner sc) {
        System.out.print("Please enter the amount to withdraw (multiple of 100): ");
        int amount = sc.nextInt();

        if (amount % 100 != 0) {
            System.out.println("Error: Please enter a valid amount in multiples of 100.");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Please collect your cash.");
        }
    }

    public void balanceCheck() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    public void deposit(Scanner sc) {
        System.out.print("Enter the amount to deposit: ");
        int amount = sc.nextInt();

        if (amount <= 0) {
            System.out.println("Please enter a valid amount greater than 0.");
        } else {
            balance += amount;
            System.out.println("Amount deposited successfully.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AtmApp atm = new AtmApp();

        System.out.println("Welcome to XYZ Bank ATM");

        System.out.print("Please enter your PIN: ");
        int pin = sc.nextInt();

        if (pin == 3333) {
            int choice;
            do {
                System.out.println("\nPlease choose an option:");
                System.out.println("1. Cash Withdrawal");
                System.out.println("2. Balance Check");
                System.out.println("3. Deposit");
                System.out.println("4. Exit");

                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        atm.cashWithdrawal(sc);
                        break;
                    case 2:
                        atm.balanceCheck();
                        break;
                    case 3:
                        atm.deposit(sc);
                        break;
                    case 4:
                        System.out.println("Thank you for using XYZ Bank ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }

            } while (choice != 4);

        } else {
            System.out.println("Incorrect PIN. Access Denied.");
        }
    }

}