package collections.hashmaps;

import java.util.HashMap;
import java.util.Scanner;

public class PasswordSaves
{

    public HashMap<String, String> createPasses()
    {
        HashMap<String, String> userPasswords = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag)
        {
            System.out.print("Enter Username: ");
            String username = scanner.nextLine();

            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            userPasswords.put(username, password);

            System.out.print("Press 'Y' to continue or another key to exit:");
            String input = scanner.nextLine();
            if (!input.equalsIgnoreCase("Y"))
            {
                flag = false;
            }
        }

        return userPasswords;
    }

    public static void main(String[] args)
    {
        PasswordSaves passwordSaves = new PasswordSaves();
        HashMap<String, String> output = passwordSaves.createPasses();
        System.out.println("All passwords are here: "+output);
    }
}
