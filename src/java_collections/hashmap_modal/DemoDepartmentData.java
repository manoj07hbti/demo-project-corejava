package java_collections.hashmap_modal;

import model.Employee;

import java.util.HashMap;
import java.util.HashSet;

public class DemoDepartmentData {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Anjali", 28, "E101","HR");
        Employee emp2 = new Employee("Ravi", 30, "E102","IT");
        Employee emp3 = new Employee("Neha", 26, "E103","HR");
        Employee emp4 = new Employee("Suman", 32, "E104","FINANCE");
        Employee emp5 = new Employee("Amit", 29, "E105","MARKETING");
        Employee emp6 = new Employee("Ravi", 30, "E106","HR");  // duplicate
        Employee emp7 = new Employee("Anjali", 28, "E101","HR");  // duplicate

        // Department-wise Employee sets
        HashSet<Employee> deptA = new HashSet<>();
        HashSet<Employee> deptB = new HashSet<>();

        deptA.add(emp1);
        deptA.add(emp2);
        deptA.add(emp7);
        deptB.add(emp4);
        deptB.add(emp5);
        deptB.add(emp6);
        deptB.add(emp3);

        // Store departments in a HashMap
        HashMap<String, HashSet<Employee>> departmentData = new HashMap<>();

        departmentData.put("Dept-A", deptA);
        departmentData.put("Dept-B", deptB);

        // Print all HR department employees
        System.out.println("Printing HR Department Employees:");

        for (String key : departmentData.keySet()) {
            for (Employee emp : departmentData.get(key)) {
                if (emp.getEmpDepart().equals("HR")) {
                    System.out.println("From " + key + ": Name: " + emp.getName() + ", Age: " + emp.getAge() + ", Emp ID: " + emp.getEmpID()+ ", Department: " + emp.getEmpDepart());
                }
            }
        }
    }
}
