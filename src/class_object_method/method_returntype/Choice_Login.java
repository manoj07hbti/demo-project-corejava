package class_object_method.method_returntype;

import javax.sound.midi.Soundbank;
import java.io.FilterOutputStream;

public class Choice_Login {

    // Write a code to login System
    // if

    public boolean loginCheck(String name, String password){
        if (name.equals("Neeshu") && password.equals("Happy1234")){
            return true;
        }else {
            return false;
        }
    }

    public String welcomeScreen(){
        return "Welcome to PNB Bank...";
    }

    public String errorScreen(){
        return "Invalid User Name or Password, Please try again....";
    }


    public static void main(String[] args) {

        Choice_Login obj = new Choice_Login();

       if (obj.loginCheck("Neeshu","Happy1234")){
           String result =obj.welcomeScreen();
           System.out.println(result);
       }else {
           String result=obj.errorScreen();
           System.out.println(result);
       }
    }
}
