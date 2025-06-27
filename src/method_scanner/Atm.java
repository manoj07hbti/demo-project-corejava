package method_scanner;

import andopreator.SwitchAndCase;

import java.util.Scanner;

public class Atm {

    public Boolean checkLogin(String userName, String password) {

        String username = "tarun";
        String password1= "tar123";

        if (username.equals("tarun") && password1.equals("tar123")) {
            return true;
        } else
            return false;
    }

    public String welcome() {

        return "Welcome to SBI Bank ATM System, please select your choice ..";
    }

    public String error() {

        return "User name  and password is incorrect, please try again..";
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("please enter your name ");
        String username = obj.nextLine();
        System.out.println("please enter your password");
        String password = obj.nextLine();


        Atm login = new Atm();
        if (username.equals("tarun") && (password.equals("tar123"))) {
            System.out.println(login.welcome());
        } else {
            System.out.println(login.error());
        }

        Scanner obj1 = new Scanner(System.in);

        System.out.println("1- balance  2- change username and pin  3- cash withdraw  4- exit");
        int choice = obj1.nextInt();

        if (choice==1) {
            System.out.println(" your current balance is= 10000");
        }
        if (choice==2){
            System.out.println("please enter your current username and pin ");
        }
        if (choice==3){
            System.out.println("please enter your amount= 500, 1000, 2000, 5000 ");
        }
        if (choice==4){
            System.out.println("thanks for using have a nice day ");
        }

    }

}


