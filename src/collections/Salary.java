package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Salary {

    public ArrayList<Double> salary() {

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> salaries = new ArrayList<>();
        while (flag) {
            System.out.println("Please enter salary");
            Double salary = scanner.nextDouble();
            salaries.add(salary);
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Do you want to enter more salary, press Z to continue or any other key to exit");
            String choice = scanner1.nextLine();

            if (!(choice.equals("Z") == true)) {
                flag = false;
            }
        }
        return salaries;

    }

    public static void main(String[] args) {

        Salary obj= new Salary();
        ArrayList<Double>salary=obj.salary();
        System.out.println("you have entered salary as= "+salary);
    }
}
