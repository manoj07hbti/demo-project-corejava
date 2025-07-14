package test_13_July;

import java.util.Scanner;

public class Test2 {

    public int pin = 3333;
    public double balance = 100000;

    public static void main(String[] args) {
        Test2 obj = new Test2();

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            // welcome Screen
            System.out.println("Welcome to XYZ Bank ATM");
            System.out.print("Please enter your pin : ");
            int check_pin = scanner.nextInt();

            boolean new_flag = true;
            while (new_flag){
                // Checking pin is correct or not
                if (check_pin == obj.pin){
                    System.out.print("1. cash withdraw, 2. balance check, 3. deposit, 4. exit from menu : ");
                    int choice = scanner.nextInt();
                    // Cash Withdraw when pressing 1 as choice
                    if (choice == 1){
                        System.out.print("Enter Amount in multiple of 100 to withdraw : ");
                        double amount = scanner.nextDouble();
                        if (amount % 100 == 0){
                            obj.balance -= amount;
                        }else {
                            System.out.println("Enter Correct amount.");
                        }
                    } else if (choice == 2) {   // Show current balance when pressing 2 as choice
                        System.out.println("Your current balance is : "+obj.balance);
                    } else if (choice == 3) {   // Deposit amount when pressing 3 as choice
                        System.out.print("Enter Amount to Deposit : ");
                        double amount = scanner.nextDouble();
                        if (amount<=0){
                            System.out.println("Enter valid amount.");
                        }else {
                            obj.balance += amount;
                        }
                    } else if (choice == 4) {   // Exit and move to the welcome screen
                        new_flag = false;
                    }
                }
            }

            System.out.print("Press Y to continue or any other key to exit: ");
            scanner.nextLine();
            String choice = scanner.nextLine();
            if (!choice.equals("Y")) {
                flag = false;
            }
        }

        scanner.close();
    }

}
