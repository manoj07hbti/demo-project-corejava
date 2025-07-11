package java_collections.list_generic;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee_List_Generics {

    public ArrayList<String> addName(){
        boolean flag=true;

        Scanner scanner = new Scanner(System.in);

        // Syntax arraylist generic: CollectionName <DataType> objName =new CollectionName<>();
        ArrayList<String> employeesName = new ArrayList<>();

        while (flag){
            System.out.println("Please Enter Employee Name :");
            String name = scanner.nextLine();
            employeesName.add(name);
            System.out.println("Do you enter more Employee Name, Press Y to continue or any key to exit");
            String choice = scanner.nextLine();
            if (!choice.equals("Y")==true){
                flag =false;
            }
        }
        return employeesName;
    }

    public ArrayList<Integer> addEmpID(){
        boolean flag=true;

        Scanner scanner = new Scanner(System.in);

        // Syntax arraylist generic: CollectionName <DataType> objName =new CollectionName<>();
        ArrayList<Integer> employeesID = new ArrayList<>();

        while (flag){
            System.out.println("Please Enter Employee ID :");
            Integer empID = scanner.nextInt();
            employeesID.add(empID);
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Do you enter more Employee ID's, Press Y to continue or any key to exit");

            String choice = scanner1.nextLine();
            if (!choice.equals("Y")==true){
                flag =false;
            }
        }
        return employeesID;
    }

    public ArrayList<Double> addSalary(){
        boolean flag=true;

        Scanner scanner = new Scanner(System.in);

        // Syntax arraylist generic: CollectionName <DataType> objName =new CollectionName<>();
        ArrayList<Double> employeesSalary = new ArrayList<>();

        while (flag){
            System.out.println("Please Enter Employee's Salary :");
            Double empSalary = scanner.nextDouble();
            employeesSalary.add(empSalary);
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Do you enter more Employee's Salary, Press Y to continue or any key to exit");

            String choice = scanner1.nextLine();
            if (!choice.equals("Y")==true){
                flag =false;
            }
        }
        return employeesSalary;
    }


    public static void main(String[] args) {

        Employee_List_Generics obj = new Employee_List_Generics();
        // Call student name Method
        ArrayList<String> output =obj.addName();
        System.out.println("You have entered Employee's Name as : "+output);
        // Call student AGE Method

        System.out.println("You have entered Employee's ID as : "+obj.addEmpID());

        System.out.println("You have entered Employee's Salary as :"+obj.addSalary());

    }
}
