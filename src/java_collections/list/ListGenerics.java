package java_collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ListGenerics {

    // write a code to store Student names for a class

    public ArrayList<String> addName(){
        boolean flag=true;
        Scanner scanner= new Scanner(System.in);
        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList <String> names= new ArrayList<>(); // we have created list of Name which stores String value
        while (flag){
            System.out.println("Please enter Student name :");
            String studentName=scanner.nextLine();
            names.add(studentName);
            System.out.println("Do you want to enter more names, press Y to continue or any other key to exit");
            String choice=scanner.nextLine();
            if (!(choice.equals("Y")==true)){
                flag=false;
            }
        }
        return names;

    }

    public ArrayList<Integer> addAge(){
        boolean flag=true;
        Scanner scanner= new Scanner(System.in);
        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList <Integer> ages= new ArrayList<>(); // we have created list of Age which stores Int value
        while (flag){
            System.out.println("Please enter Student Age :");
            Integer StudentAge=scanner.nextInt();
            ages.add(StudentAge);
            Scanner scanner1= new Scanner(System.in);
            System.out.println("Do you want to enter more names, press Y to continue or any other key to exit");
            String choice=scanner1.nextLine();

            if (!(choice.equals("Y")==true)){
                flag=false;
            }
        }
        return ages;

    }
    //TODO create method to store % -- 67.45 ,23.56 , 79.67 .....


    public static void main(String[] args) {

        ListGenerics obj= new ListGenerics();
        ArrayList <String> output= obj.addName();
        System.out.println("you have  entered Student names as : "+output);

        System.out.println("You have entered Age as :"+obj.addAge());
    }
}
