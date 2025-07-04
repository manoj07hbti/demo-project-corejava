package method.scanner;
import java.util.Scanner;
public class AtmLogin {

    public boolean checkLogin(String userName, String password){
        if (userName.equals("harishaxis") && password.equals("456789")){
         return true;
        }else{
            return false;
        }
    }
    public String welcomeScreen(){
        return "Welcome to HDFC Bank ATM System, please select your choice ...";
    }
    public String errorScreen(){
       return "User Name or password is Incorrect, please try again...";
    }
    public static void main(String[] args) {
        AtmLogin obj = new AtmLogin();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter you username");
        String userName= sc.nextLine();
        System.out.println("Enter your password");
        String password=sc.nextLine();
        if (obj.checkLogin(userName,password)){
            String msg = obj.welcomeScreen();
            System.out.println(msg);
        }else{
         String msg=obj.errorScreen();
            System.out.println(msg);
        }

    }
}
