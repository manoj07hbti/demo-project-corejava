package methods.retrun_type;

public class AtmLoginScreen {

    //create an Application which can authenticate user and give desires screen
    //in case of invalid user it should display warning message.

    // checkLogin   ----> success ----> Welcome Screen
    // checkLogin -------> fail  ----> Warning Screen

    public Boolean checkLogin(String userName,String password){
        // ADMIN - pwd
        if(userName.equals("ADMIN") && password.equals("ABCD12345")){
            return true;
        }else
            return false;

    }

    public String welcomeScreen(){

        return "Welcome to HDFC Bank ATM System, please select your choice ...";
    }
    public String errorScreen(){

        return "User Name or password is Incorrect, please try again...";
    }


    public static void main(String[] args) {
        // call checklogin
        // if user is valid then show welcome screen or if password is wrong then show error screen.

        AtmLoginScreen obj= new AtmLoginScreen();

        if(obj.checkLogin("ADMIN","ABCD12345"))
        {
            String msg= obj.welcomeScreen();
            System.out.println(msg);
        }else {
            String msg= obj.errorScreen();
            System.out.println(msg);
        }
    }

}