package collections.hashmaps;

import model.Employee;
import java.util.ArrayList;
import java.util.HashMap;

public class DCXEmployees {

    public HashMap<String, ArrayList<Employee>> employeeList() {

        Employee emp1 = new Employee("John", 256, "Backend");
        Employee emp2 = new Employee("Jack", 347, "Frontend");
        Employee emp3 = new Employee("Dutch", 445, "DevOps");

        ArrayList<Employee> dcxList = new ArrayList<>();
        dcxList.add(emp1);
        dcxList.add(emp2);
        dcxList.add(emp3);

        HashMap<String, ArrayList<Employee>> dataMap = new HashMap<>();
        dataMap.put("DCX Employees", dcxList);

        return dataMap;
    }

    public static void main(String[] args) {
        DCXEmployees obj = new DCXEmployees();
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
