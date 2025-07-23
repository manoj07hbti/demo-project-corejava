package collections.hashmaps;

import model.Employee;
import java.util.ArrayList;
import java.util.HashMap;

public class CTSEmployees {

    public HashMap<String, ArrayList<Employee>> employeeList() {
        Employee emp1 = new Employee("Tanisha", 201, "Cybersecurity");
        Employee emp2 = new Employee("Lamar", 202, "Testing");
        Employee emp3 = new Employee("Franklin", 203, "Mobile Apps");

        ArrayList<Employee> ctsList = new ArrayList<>();
        ctsList.add(emp1);
        ctsList.add(emp2);
        ctsList.add(emp3);

        HashMap<String, ArrayList<Employee>> dataMap = new HashMap<>();
        dataMap.put("CTS Employees", ctsList);

        return dataMap;
    }

    public static void main(String[] args) {
        CTSEmployees obj = new CTSEmployees();
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
