package java_collections.list.generic;

import java.util.ArrayList;
import java.util.Scanner;

public class CountryName_List_Generics {

    //Write a code to store CountryName og a class

    public ArrayList<String> countryName(){
        boolean flag=true;

        Scanner scanner = new Scanner(System.in);

        // Syntax arraylist generic: CollectionName <DataType> objName =new CollectionName<>();
        ArrayList <String> countryNames = new ArrayList<>();

        while (flag){
            System.out.println("Please enter Country Name : ");
            String country= scanner.nextLine();
            countryNames.add(country);

            System.out.println("Do you enter more Country Name, Press Y to continue or any key to exit");
            String choice = scanner.nextLine();

            if (!choice.equals("Y")==true){
                flag=false;
            }
        }
        return countryNames;

    }
    // Create method Population
    public ArrayList<Long> addPopulation(){
        boolean flag=true;

        Scanner scanner = new Scanner(System.in);

        // Syntax arraylist generic: CollectionName <DataType> objName =new CollectionName<>();
        ArrayList<Long> countryPopulation = new ArrayList<>();

        while (flag) {
            System.out.println("Please enter Country Population : ");
            Long population = scanner.nextLong();
            countryPopulation.add(population);
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Do you enter more country population, Press Y or any key to exit");
            String choice = scanner1.nextLine();
            if (!choice.equals("Y")==true){
                flag=false;
            }
        }
        return countryPopulation;
    }

    public static void main(String[] args) {

        CountryName_List_Generics obj = new CountryName_List_Generics();
        ArrayList<String> output =obj.countryName();
        System.out.println(" You have Entered CountryName as : "+output);

        System.out.println("You have Entered country Population as : "+obj.addPopulation());
    }
}
