package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Country_Names {

    public ArrayList<String> countryNames(){

        boolean flag= true;
        Scanner Scanner= new Scanner(System.in);
        ArrayList<String> names= new ArrayList<>();

        while (flag){
            System.out.println("Please enter country names");
            String country= Scanner.nextLine();
            names.add(country);
            System.out.println("Do you want to add more country names if yes then press Z otherwise press any key to exit");
            String choice= Scanner.nextLine();

            if (!(choice.equals("Z")==true)){
                flag= false;
            }
        }
        return names;

    }

    public static void main(String[] args) {

        Country_Names obj= new Country_Names();
        ArrayList<String>countrynames= obj.countryNames();

        System.out.println("you entered your country names as= "+countrynames);
    }
}
