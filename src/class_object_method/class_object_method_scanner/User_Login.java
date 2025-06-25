package class_object_method.class_object_method_scanner;

import javax.sound.midi.Soundbank;
import javax.xml.namespace.QName;
import java.util.Scanner;

public class User_Login {

    public boolean userName(String name){
        return name.equals("Neeshu14");
    }

    public boolean userPassword(String pass){
        return pass.equals("Neeshu12356");

    }

    public String welcomeScreen(){
        return "Welcome to PNB Bank...";
    }

    public String errorScreen(){
        return "Invalid User Name or Password, Please try again....";
    }

    public static void main(String[] args) {

        Scanner obj =new Scanner(System.in);

        User_Login credential = new User_Login();

        System.out.println(" Please Enter your UserName : ");
        String user=obj.nextLine();
        System.out.println("You have entered UserName as: "+credential.userName(user));

        System.out.println(" Please Enter your password: ");
        String pass=obj.nextLine();
        System.out.println("You have entered UserName as: "+credential.userPassword(pass));

        if (credential.userName(user) && credential.userPassword(pass)) {
            System.out.println(credential.welcomeScreen());
        } else {
            System.out.println(credential.errorScreen());
        }


    }

}
