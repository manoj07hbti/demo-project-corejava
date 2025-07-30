package java_collections.hashmap_modal;

import model.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeScannerHashMap {

    // Method to create employee data dynamically
    public HashMap<String, ArrayList<Employee>> createEmployeeData() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<Employee>> companyWiseData = new HashMap<>();

        while (true) {
            System.out.print("Do you want to add a new company? (yes/no): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }

            System.out.print("Enter company name: ");
            String companyName = scanner.nextLine();

            System.out.print("Enter number of employees in " + companyName + ": ");
            int employeeCount = scanner.nextInt();
            scanner.nextLine();

            ArrayList<Employee> employeesList = new ArrayList<>();

            for (int j = 1; j <= employeeCount; j++) {
                System.out.println("Enter details for Employee " + j + ":");

                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Age: ");
                int age = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Employee ID: ");
                String empID = scanner.nextLine();

                System.out.print("Employee Department: ");
                String empDepart = scanner.nextLine();

                Employee employee = new Employee(name, age, empID, empDepart);
                employeesList.add(employee);
            }

            companyWiseData.put(companyName, employeesList);
        }

        return companyWiseData;
    }

    public static void main(String[] args) {
        EmployeeScannerHashMap obj = new EmployeeScannerHashMap();
        HashMap<String, ArrayList<Employee>> result = obj.createEmployeeData();

        for (String company : result.keySet()) {
            System.out.println("\nCompany Name: " + company);
            ArrayList<Employee> employees = result.get(company);
            for (Employee emp : employees) {
                System.out.println("Name: " + emp.getName()+ ", Age: " + emp.getAge() + ", Employee ID: " + emp.getEmpID() + ", Department: " + emp.getEmpDepart());
            }
        }
    }
}
