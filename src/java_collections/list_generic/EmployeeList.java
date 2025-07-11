package java_collections.list_generic;

import model.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {

    //create Method for Employee data
    public Employee createEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Please Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please Enter Emp Id : ");
        String empID = scanner.nextLine();
        System.out.println("Please Enter Department : ");
        String depart = scanner.nextLine();

        Employee employee = new Employee(name, age, empID, depart);

        return employee;

    }

    public static void main(String[] args) {

        // write a logic to call create employee data based on user choice and add to the List
        // Syntax arraylist generic: CollectionName <DataType> objName =new CollectionName<>();
        ArrayList<Employee> employeesList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        EmployeeList obj = new EmployeeList();

        boolean flag = true;
        while (flag == true) {
            Employee employeeObj = obj.createEmployee(); // create variable for store value of the Method
            employeesList.add(employeeObj);
            System.out.println("Do you want add more Employee ? press Y to continue or any other key to exit");
            String choice = scanner.nextLine();
            if (!choice.equals("Y")) {
                flag = false;
            }
            //  System.out.println(employeesList);
            for (Employee var : employeesList) {
                System.out.println("Name: " + var.getName() + " Age: " + var.getAge() + " EmpId " + var.getEmpID()+" Department: "+var.getEmpDepart());
            }
        }
    }
}


