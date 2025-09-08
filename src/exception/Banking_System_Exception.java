package exception;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Banking_System_Exception {

        HashMap<Integer, Double> accounts = new HashMap<>();
        HashSet<String> customers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Create account
        public void createAccount() {
            try {
                System.out.print("Enter customer name: ");
                String name = scanner.nextLine();
                customers.add(name);

                System.out.print("Enter account number: ");
                int accNo = scanner.nextInt();

                if (accounts.containsKey(accNo)) {
                    System.out.println("Account already exists!");
                    return;
                }

                System.out.print("Enter initial deposit: ");
                double deposit = scanner.nextDouble();

                accounts.put(accNo, deposit);
                System.out.println("Account created successfully for " + name);
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter correct data."+e);
                scanner.nextLine(); // clear buffer
            }
        }

        // Deposit
        public void deposit() {
            try {
                System.out.print("Enter account number: ");
                int accNo = scanner.nextInt();

                if (!accounts.containsKey(accNo)) {
                    System.out.println("Account not found!");
                    return;
                }

                System.out.print("Enter amount to deposit: ");
                double amount = scanner.nextDouble();

                accounts.put(accNo, accounts.get(accNo) + amount);
                System.out.println("Deposit successful. New balance: " + accounts.get(accNo));
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.nextLine();
            }
        }

        // Withdraw
        public void withdraw() {
            try {
                System.out.print("Enter account number: ");
                int accNo = scanner.nextInt();

                if (!accounts.containsKey(accNo)) {
                    System.out.println("Account not found!");
                    return;
                }

                System.out.print("Enter amount to withdraw: ");
                double amount = scanner.nextDouble();

                double balance = accounts.get(accNo);
                if (amount > balance) {
                    System.out.println("Insufficient balance!");
                } else {
                    accounts.put(accNo, balance - amount);
                    System.out.println("Withdrawal successful. Remaining balance: " + accounts.get(accNo));
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.nextLine();
            }
        }

        // Check balance
        public void checkBalance() {
            try {
                System.out.print("Enter account number: ");
                int accNo = scanner.nextInt();

                if (accounts.containsKey(accNo)) {
                    System.out.println("Balance: " + accounts.get(accNo));
                } else {
                    System.out.println("Account not found!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                scanner.nextLine();
            }
        }

        // Menu
        public void startBanking() {
            while (true) {
                System.out.println("\n===== ZBanking System =====");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Check Balance");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                try {
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // clear buffer

                    if (choice == 1) createAccount();
                    else if (choice == 2) deposit();
                    else if (choice == 3) withdraw();
                    else if (choice == 4) checkBalance();
                    else if (choice == 5) {
                        System.out.println("Thank you for banking with us!");
                        break;
                    } else {
                        System.out.println("Invalid choice. Try again.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Please enter a valid number choice.");
                    scanner.nextLine();
                }
            }
        }

        public static void main(String[] args) {
            Banking_System_Exception bank = new Banking_System_Exception();
            bank.startBanking();
        }
    }


