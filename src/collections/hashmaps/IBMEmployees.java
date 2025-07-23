package collections.hashmaps;

import model.Employee;
import java.util.ArrayList;
import java.util.HashMap;

public class IBMEmployees {

    public HashMap<String, ArrayList<Employee>> employeeList() {
        Employee emp1 = new Employee("Max", 101, "Cloud");
        Employee emp2 = new Employee("Lewis", 102, "AI & ML");
        Employee emp3 = new Employee("Arthur", 103, "Data Analytics");

        ArrayList<Employee> ibmList = new ArrayList<>();
        ibmList.add(emp1);
        ibmList.add(emp2);
        ibmList.add(emp3);

        HashMap<String, ArrayList<Employee>> dataMap = new HashMap<>();
        dataMap.put("IBM Employees", ibmList);

        return dataMap;
    }

    public static void main(String[] args) {
        IBMEmployees obj = new IBMEmployees();
        HashMap<String, ArrayList<Employee>> result = obj.employeeList();

        for (String key : result.keySet()) {
            System.out.println("=== " + key + " ===");
            ArrayList<Employee> employees = result.get(key);
            for (Employee emp : employees) {
                System.out.println("Name: " + emp.getName() + ", ID Code: " + emp.getIdCode() + ", Team: " + emp.getTeam());
            }
        }
    }
}
