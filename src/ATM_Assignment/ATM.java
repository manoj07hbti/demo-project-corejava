package ATM_Assignment;

import java.util.Scanner;

public class ATM {
    /*
    ATM App choice 1-balance, 2 pin change, 3 cash withdraw, 4 mobile update Ask User to Exit
     */

    private int balace = 100000;
    private int pin = 1111;
    private long mobile_number = 9838232378L;

    public int Balance(){
        return balace;
    }

    public void change_pin(int new_pin){
        pin = new_pin;
    }

    public boolean withdraw(int amount){
        if (amount > balace){
            return false;
        }
        else {
            balace -= amount;
            return true;
        }
    }

    public void Update_mobile(long new_mobile){
        mobile_number = new_mobile;
    }

    public int getPin(){
        return pin;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ATM atm = new ATM();
        System.out.println("Welcome To Harshvardhan ATM System Using Java.");

        String flag = "Yes";
       while (flag.equals("Yes")){
            System.out.print("What do you want to do (Check Balance, Change Pin, Cash Withdraw, Update Mobile): ");
            String choice = scan.nextLine();

            if (choice.equals("Check Balance")){
                System.out.print("Enter your pin: ");
                int Test_pin = scan.nextInt();
                if (Test_pin== atm.getPin()){
                    System.out.println("Your balance is: ₹" + atm.Balance());
                }else {
                    System.out.println("Incorrect PIN, Please Check.");
                }
            } else if (choice.equals("Change Pin")) {
                System.out.print("Enter your pin: ");
                int Test_pin = scan.nextInt();
                if (Test_pin== atm.getPin()){
                    System.out.print("Enter New PIN: ");
                    int New_pin = scan.nextInt();
                    atm.change_pin(New_pin);
                    System.out.println("Your PIN is changed to "+atm.getPin());
                }else{
                    System.out.println("Incorrect PIN, Please Check.");
                }

            } else if (choice.equals("Cash Withdraw")) {
                System.out.print("Enter your pin: ");
                int Test_pin = scan.nextInt();
                if (Test_pin== atm.getPin()){
                    System.out.print("Enter amount to withdraw: ");
                    int amount = scan.nextInt();

                    if (atm.withdraw(amount)){
                        System.out.println("Please collect your cash, remaining balance: "+atm.Balance());
                    }else {
                        System.out.println("Insufficient balance.");
                    }
                }else {
                    System.out.println("Incorrect PIN.");
                }
            } else if (choice.equals("Update Mobile")) {
                System.out.print("Enter your pin: ");
                int Test_pin = scan.nextInt();
                if (Test_pin== atm.getPin()){
                    System.out.print("Enter new mobile number: ");
                    long new_mobile = scan.nextLong();
                    atm.Update_mobile(new_mobile);
                    System.out.println("Mobile number updated successfully.");
                }else {
                    System.out.println("Incorrect PIN.");
                }
            }else {
                System.out.println("Invalid choice. Please try again.");
            }

            System.out.print("Do you want to do any other operation? Type 'Yes' to continue or any key to stop: ");
            flag = scan.next();
            scan.nextLine();
       }
        System.out.println("Thank you for using the ATM. Goodbye!");
        scan.close();

    }
}




