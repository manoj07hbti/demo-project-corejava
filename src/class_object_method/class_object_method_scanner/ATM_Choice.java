package class_object_method.class_object_method_scanner;

import java.util.Scanner;

public class ATM_Choice {

    // Write a program for ATM Choice 1-Balance Check,
    // 2- Pin Change, 3-Cash Withdraw, 4- Mobile Update

    double balance =10000.0; // this is Initial Balance
    int pin = 1401; // default  Pin
    long mobileNumber = 9876543210L; // Default mobile number

    //  Method to check balance
    public String checkBalance(){
        return ("\n Your Current Balance.."+balance);
    }

    // Method to change PIN
    public void changePin(int pinNumber) {
        int currentPin = pinNumber;

        if (currentPin != pin) {
            System.out.println("Incorrect PIN. Try again.");

        }
    }
    // Method to cash Withdrawal
    public int withdrawCash(int amount){
        if (amount>balance){
            System.out.println("Insufficient balance. your balance is "+balance);
        }else {
            balance=-amount;
            System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
        }
        return amount;
    }
    // Method to mobile number update
    public void Update_mobile(long new_mobile) {
        mobileNumber = new_mobile;

    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        ATM_Choice methodCall = new ATM_Choice();

        // Welcome screen of ATM
        System.out.println("************** Welcome to HDFC bank ATM*************");

        // Enter pin for access account option
        System.out.println("Enter your pin: ");
        int enteredPin = obj.nextInt();
        if (enteredPin== methodCall.pin) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Balance Check");
            System.out.println("2. PIN Change");
            System.out.println("3. Cash Withdraw");
            System.out.println("4. Mobile Update");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
        } else {
            System.out.println("Incorrect PIN. Exiting...");
        }

//===========================================================================================
        //ATM Choice 1-Balance Check,
        // 2- Pin Change, 3-Cash Withdraw, 4- Mobile Update
        int choice = obj.nextInt();

        if (choice==1){
            System.out.println("Your current balance: "+methodCall.checkBalance());
        } else if(choice == 2) {
            // Logic for pin change
            System.out.print("Enter new PIN: ");
            int newPin = obj.nextInt();
            System.out.print("Confirm new PIN: ");
            int confirmPin = obj.nextInt();
            if (newPin == confirmPin) {
                confirmPin = newPin;
                System.out.println("PIN changed successfully.");
            } else {
                System.out.println("PINs do not match. Try again.");
            }
        } else if (choice == 3) { // for Cash Withdrawal
            System.out.println("Please enter amount: ");
            int amount = obj.nextInt();
            System.out.println(methodCall.withdrawCash(amount));
        } else if (choice==4) {
            System.out.println("Enter new Mobile Number: "); // for Update New Mobile
            long newMobile =obj.nextLong();
            methodCall.Update_mobile(newMobile);
            System.out.println("Mobile number updated successfully...: "+newMobile);
        }else if (choice==5) {
            System.out.println("*************************Thanks for using HDFC Bank ATM*************************");
        }
        
    }

}



