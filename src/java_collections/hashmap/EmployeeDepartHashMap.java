package java_collections.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDepartHashMap {

    public HashMap<String, String> getEmployeeDepartments() {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> employeeMap = new HashMap<>();

        System.out.println("Enter Employee Name and Department (type 'no' to stop):");

        while (true) {
            System.out.print("Employee Name: ");
            String name = scanner.nextLine();

            System.out.print("Department: ");
            String department = scanner.nextLine();

            employeeMap.put(name, department);

            System.out.print("Do you want to add more? (y/no): ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        return employeeMap;
    }

    public static void main(String[] args) {
        EmployeeDepartHashMap obj = new EmployeeDepartHashMap();
        HashMap<String, String> map = obj.getEmployeeDepartments();

        System.out.println("\nEmployee - Department List:");
        for (String name : map.keySet()) {
            System.out.println(name + " => " + map.get(name));
        }
    }
}
