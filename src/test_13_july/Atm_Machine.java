package test_13_july;

import java.util.Scanner;

public class Atm_Machine {

    int pin =3333;
    int balance= 10000;
    Scanner scanner =new Scanner(System.in);

    public void Screen(){

        System.out.println("Welcome To SBI Bank Please Enter Your Pin");
        int enterPin= scanner.nextInt();
        if (pin==enterPin){

            System.out.println(" Invalid Pin Please try Again");
        }else {
            System.out.println("Please Select Your Options: 1 Cash Withdrawal, 2-Balance Check, 3-Deposit, 4-Exit From Menu");
        }
        int choice =scanner.nextInt();
        switch (choice){

            case 1:
                System.out.print("Enter amount to withdraw ");
                System.out.println("100 , 200 , 500 , 2000");
                double withdrawAmount = scanner.nextDouble();

                if (withdrawAmount % 100 != 0) {
                    System.out.println("Please Enter The Amount mentioned Above");
                } else if (withdrawAmount > balance) {
                    System.out.println("Error Insufficient Balance ");
                } else {

                    balance -= withdrawAmount;
                    System.out.println("Please collect your cash WithDrawl Amount Is= "+ withdrawAmount);
                    System.out.println("Remaining balance: " + balance);
                }

            case 2:
                System.out.println("Your Current Balance Is= "+balance);

            case 3:

                System.out.println("How Much Amount Do You Want To Deposit Please Enter Your Amount ");
                double depositAmount =scanner.nextDouble();

                if (depositAmount<=0) {
                    System.out.println("");
                }else {
                    balance+=depositAmount;
                    System.out.println("Deposit Successful");
                    System.out.println("New Balance is= "+balance);
                }
            case 4:
                System.out.println("Thanks For Using SBI Bank ATM ... Have A Nice Day");
        }
    }
    public static void main(String[] args) {

        Atm_Machine obj= new Atm_Machine();
        obj.Screen();
    }


}
