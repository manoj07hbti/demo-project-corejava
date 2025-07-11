package java_collections.list_generic;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_List_Generic {

    //

    public ArrayList<String> addName(){
        boolean flag=true;

        Scanner scanner = new Scanner(System.in);

        // Syntax arraylist generic: CollectionName <DataType> objName =new CollectionName<>();
        ArrayList<String> studentNames = new ArrayList<>();

        while (flag){
            System.out.println("Please Enter Student Name :");
            String name = scanner.nextLine();
            studentNames.add(name);
            System.out.println("Do you enter more Student Name, Press Y to continue or any key to exit");
            String choice = scanner.nextLine();
            if (!choice.equals("Y")==true){
                flag =false;
            }
        }
        return studentNames;
    }

    public ArrayList<Integer> addAge(){
        boolean flag=true;

        Scanner scanner = new Scanner(System.in);

        // Syntax arraylist generic: CollectionName <DataType> objName =new CollectionName<>();
        ArrayList<Integer> studentAges = new ArrayList<>();

        while (flag){
            System.out.println("Please Enter Student Age :");
            Integer age = scanner.nextInt();
            studentAges.add(age);
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Do you enter more Student Ages, Press Y to continue or any key to exit");

            String choice = scanner1.nextLine();
            if (!choice.equals("Y")==true){
                flag =false;
            }
        }
        return studentAges;
    }

    public ArrayList<Double> addPercentage(){
        boolean flag=true;

        Scanner scanner = new Scanner(System.in);

        // Syntax arraylist generic: CollectionName <DataType> objName =new CollectionName<>();
        ArrayList<Double> studentPercentages = new ArrayList<>();

        while (flag){
            System.out.println("Please Enter Student Percentages :");
            Double percentage = scanner.nextDouble();
            studentPercentages.add(percentage);
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Do you enter more Percentage, Press Y to continue or any key to exit");

            String choice = scanner1.nextLine();
            if (!choice.equals("Y")==true){
                flag =false;
            }
        }
        return studentPercentages;
    }


    public static void main(String[] args) {

        Student_List_Generic obj = new Student_List_Generic();
        // Call student name Method
        ArrayList<String> output =obj.addName();
        System.out.println("You have entered Student Name as : "+output);
        // Call student AGE Method

        System.out.println("You have entered Student Age as : "+obj.addAge());

        System.out.println("You have entered Student Percentages as :"+obj.addPercentage()+"%");

    }
}
