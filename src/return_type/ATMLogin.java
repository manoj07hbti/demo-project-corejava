package return_type;

public class ATMLogin
{
    public boolean welcomeUser(String username, int pin)
    {
        if (username.equals("Admin56") && pin == 5566)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String continueScreen()
    {
        return  "Hi, welcome to our ATM... Please select your choice :)";
    }

    public String errorScreen()
    {
        return "Incorrect details... Please try again :(";
    }

    public static void main(String[] args)
    {
        ATMLogin atmLogin = new ATMLogin();
        String message;

        if (atmLogin.welcomeUser("Admin56",5566))
        {
            message = atmLogin.continueScreen();
            System.out.println(message);
        }
        else
        {
            message = atmLogin.errorScreen();
            System.out.println(message);
        }
    }
}
