package java_collections.list;
import java.util.ArrayList;
import java.util.Scanner;
public class ListCountriesName {

    public ArrayList <String> addCountriesName() {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> countries = new ArrayList<>();
        while (flag) {
            System.out.println("Please enter country name: ");
            String countriesName = scanner.nextLine();
            countries.add(countriesName);
            System.out.println("If you want to enter more names, enter y otherwise any other keys");
            String choice = scanner.nextLine();
            if (!(choice.equals("y") == true)) {
                flag = false;
            }

        }
        return countries;

    }

    public static void main(String[] args) {

        ListCountriesName obj = new ListCountriesName();
        ArrayList <String> output = obj.addCountriesName();
        System.out.println("your entered countries names are : "+ output);

    }
}
