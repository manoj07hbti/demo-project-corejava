package java_collections.hashmap_modal;

import model.Employee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DepartmentDataScanner {

    //  method to input employee data for one department
    public HashSet<Employee> addEmployees(String deptName) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Employee> employeeSet = new HashSet<>();

        System.out.print("Enter number of employees for " + deptName + ": ");
        int empCount = scanner.nextInt();

        for (int i = 1; i <= empCount; i++) {
            System.out.println("Enter details for Employee " + i + ":");
            System.out.print("Employee Name: ");
            String name = scanner.next();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Employee ID: ");
            String empId = scanner.next();

            System.out.print("Department: ");
            String department = scanner.next();

            Employee emp = new Employee(name, age, empId, department);
            employeeSet.add(emp);
        }

        return employeeSet;
    }

    // Main method
    public static void main(String[] args) {
        // Create object to call non-static method
        DepartmentDataScanner obj = new DepartmentDataScanner();

        // Call the  method using object
        HashSet<Employee> deptA = obj.addEmployees("Dept-A");
        HashSet<Employee> deptB = obj.addEmployees("Dept-B");

        // Store departments in a HashMap
        HashMap<String, HashSet<Employee>> departmentData = new HashMap<>();
        departmentData.put("Dept-A", deptA);
        departmentData.put("Dept-B", deptB);

        // Print all CS department employees
        System.out.println("\nPrinting CS Department Employees:");
        for (String key : departmentData.keySet()) {
            for (Employee emp : departmentData.get(key)) {
                if (emp.getEmpDepart().equalsIgnoreCase("CS")) {
                    System.out.println("From " + key + ": Name: " + emp.getName() +
                            ", Age: " + emp.getAge() + ", Department: " + emp.getEmpDepart());
                }
            }
        }
    }
}
