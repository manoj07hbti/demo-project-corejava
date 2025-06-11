package class_object_method.object_method;

public class System_Login_Authenticator {

    // write a code Authentication

    // create one method for authenticate
    public void authenticator() {

        String userName[] = {"Neeshu01", "Rahul", "Shubham"};
        String pass[] = {"Password123", "Password12", "Password1"};

        String inputUser = "Manoj1";
        String inputPass = "Password123";

        boolean authenticated = false;

        for (int i = 0; i < userName.length; i++) {
            if (userName[i].equals(inputUser) && pass[i].equals(inputPass)) {
                    authenticated =true;
                    break;
            }
        }
        if (authenticated){
            System.out.println("You have logged in Successfully...");
        }else {
            System.out.println("Wrong username or password, please try again");
        }
    }


    public static void main(String[] args) {

        //create object to call the method
        System_Login_Authenticator user1 = new System_Login_Authenticator();

        // call method
        user1.authenticator();

    }


}
