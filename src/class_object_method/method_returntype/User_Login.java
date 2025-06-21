package class_object_method.method_returntype;

public class User_Login {

    public String userLogin(String name,String pass){

        if (name =="Neeshu" && pass=="123456"){
            return "Login Successful!";
        }else {
            return "Authentication failed, Invalid username or password.";
        }

    }

    public static void main(String[] args) {

        User_Login obj = new User_Login();

        String output=obj.userLogin("Neeshu","123456");

        System.out.println("Welcome to the ABC Limited..."+output);
    }

}

