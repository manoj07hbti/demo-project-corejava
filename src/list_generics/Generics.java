package list_generics;

import java.util.ArrayList;
import java.util.Scanner;

public class Generics {

    public static class ListGenerics {

        // write a code to store Student names for a class

        public ArrayList<String> addName() {
            boolean flag = true;
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> names = new ArrayList<>();
            while (flag) {
                System.out.println("Please enter Student name= ");
                String studentName = scanner.nextLine();
                names.add(studentName);
                System.out.println("Do you want to enter more names, press Z to continue or any other key to exit");
                String choice = scanner.nextLine();
                if (!(choice.equals("Z") == true)) {
                    flag = false;
                }
            }
            return names;

        }
//   write a code to add Student ages for a class

        public ArrayList<Integer> addAge() {
            boolean flag = true;
            Scanner scanner = new Scanner(System.in);
            ArrayList<Integer> ages = new ArrayList<>();
            while (flag) {
                System.out.println("Please enter Student Age= ");
                Integer StudentAge = scanner.nextInt();
                ages.add(StudentAge);
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Do you want to enter more age, press Z to continue or any other key to exit");
                String choice = scanner1.nextLine();

                if (!(choice.equals("Z") == true)) {
                    flag = false;
                }
            }
            return ages;
        }
//  Write a code to add StudentPercentage for a class

        public ArrayList<Double> addPercentage() {

            boolean flag = true;
            Scanner scanner = new Scanner(System.in);
            ArrayList<Double> percentage = new ArrayList<>();
            while (flag) {
                System.out.println("Please enter StudentPercentage= ");
                Double StudentPercentage = scanner.nextDouble();
                percentage.add(StudentPercentage);
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Do you want to enter more percentage, press Z to continue or any other key to exit");
                String choice = scanner1.nextLine();

                if (!(choice.equals("Z") == true)) {
                    flag = false;
                }
            }
            return percentage;

        }
        public static void main(String[] args) {

            ListGenerics obj = new ListGenerics();
            ArrayList<String> output = obj.addName();
            System.out.println("you have  entered Student names as= " + output);

            System.out.println("You have entered Age as= " + obj.addAge());

            System.out.println("you have entered StudentPercentage as= "+obj.addPercentage());

        }
    }
}

