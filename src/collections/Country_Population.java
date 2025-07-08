package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Country_Population {

    public ArrayList<Long>population(){
        boolean flag= true;
        Scanner Scanner= new Scanner(System.in);
        ArrayList<Long>countryPopulation= new ArrayList<>();

        while (flag){
            System.out.println("Please enter country population");
            Long counpopulation= Scanner.nextLong();
            countryPopulation.add(counpopulation);
            System.out.println("Do you want to add more countryPopulation if yes then press A otherwise press any key to exit");
            Scanner.nextLine();
            String choice = Scanner.nextLine();

            if (!choice.equals("A")==true){
                flag=false;
            }
        }
        return countryPopulation;
    }

    public static void main(String[] args) {

        Country_Population obj= new Country_Population();
        ArrayList<Long>population=obj.population();
        System.out.println("you have entered countryPopulation as= "+population);
    }
}
