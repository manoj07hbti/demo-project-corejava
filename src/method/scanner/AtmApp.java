package method.scanner;

import java.util.Scanner;

public class AtmApp {

    public boolean checkLogin(String userName, String password) {

        if (userName.equals("harishaxis") && password.equals("456789")) {
            return true;
        } else {
            return false;
        }

    }

    public String welcomeScreen() {

        return "Welcome to HDFC Bank ATM System, please select your choice ...";
    }

    public String balance() {
        return "x=42000";
    }

    public String pinChange() {
        return "Enter new pin ";
    }

    public String cashWithdraw() {
        return "Enter the amount";
    }

    public String mobileUpdate() {
        return "Enter new mobile number";
    }

    public String errorScreen() {
        return "User Name or password is Incorrect, please try again...";
    }
    public static void main(String[] args) {
        String flag = "y";
        Scanner username = new Scanner(System.in);
        Scanner password = new Scanner(System.in);
        Scanner userchoice = new Scanner(System.in);

        AtmApp obj = new AtmApp();

        while (flag.equals("y")) {

            System.out.println("Enter user name");
            String userName = username.nextLine();

            System.out.println("Enter your password");
            String userPassword = password.nextLine();

            if (obj.checkLogin(userName, userPassword)) {
                String msg = obj.welcomeScreen();
                System.out.println(msg);

                System.out.println("\nEnter your choice\n 1-balance\n 2-pin change\n 3-cash withdraw\n 4-mobile update");
                int choice = userchoice.nextInt();

                if (choice == 1) {
                    System.out.println(obj.balance());

                } else if (choice == 2) {
                    System.out.println(obj.pinChange());

                } else if (choice == 3) {
                    System.out.println(obj.cashWithdraw());

                } else if (choice == 4) {
                    System.out.println(obj.mobileUpdate());
                }

                Scanner obj2 = new Scanner(System.in);

                System.out.println("Press y to continue or press any other key to exit");
                flag = obj2.nextLine();

                if (!flag.equals("y")) {
                    System.out.println("Exiting .....Thanks for Using AtmApp...");
                    break;
                }
            } else {
                String msg = obj.errorScreen();
                System.out.println(msg);
            }

        }

    }


}