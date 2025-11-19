package java_collections.hashmap;
import java.util.ArrayList;
import java.util.HashMap;

import modal.Employee;

public class EmployeeHashMap {
    // we need to store data company wise
    // key-company name value-employee-ArrayList <Student> obj = new ArrayList<>();

public HashMap <String, ArrayList<Employee>> createEmployeeData(){
     // create company1 employee
    Employee employee1 = new Employee("Harish",24, "101");
    Employee employee2 = new Employee("Ankit",26, "102");
    Employee employee3 = new Employee("Vinay",27, "103");

    ArrayList <Employee> employeesListA = new ArrayList<>();
    employeesListA.add(employee1);
    employeesListA.add(employee2);
    employeesListA.add(employee3);

    //company2 employee
    Employee employee4 = new Employee("Punit",24, "104");
    Employee employee5 = new Employee("Ashu",26, "105");
    Employee employee6 = new Employee("Neeraj",27, "106");

    ArrayList <Employee> employeesListB = new ArrayList<>();
    employeesListB.add(employee4);
    employeesListB.add(employee5);
    employeesListB.add(employee6);

    //company3
    Employee employee7 = new Employee("Ravi",24, "107");
    Employee employee8 = new Employee("Aarav",26, "108");
    Employee employee9 = new Employee("Vinit",27, "109");

    ArrayList <Employee> employeesListC = new ArrayList<>();
    employeesListC.add(employee7);
    employeesListC.add(employee8);
    employeesListC.add(employee9);


    //company4 employee
    Employee employee10 = new Employee("Harry",24, "110");
    Employee employee11 = new Employee("Amit",26, "111");
    Employee employee12 = new Employee("Vijay",27, "112");

    ArrayList <Employee> employeesListD = new ArrayList<>();
    employeesListD.add(employee10);
    employeesListD.add(employee11);
    employeesListD.add(employee12);


    HashMap <String, ArrayList<Employee>> companyWiseData = new HashMap<>();
    companyWiseData.put("IBM", employeesListA);
    companyWiseData.put("TCS", employeesListB);
    companyWiseData.put("CTS", employeesListC);
    companyWiseData.put("DXC", employeesListD);

 return companyWiseData;
}

    public static void main(String[] args) {
        EmployeeHashMap obj = new EmployeeHashMap();
        HashMap <String, ArrayList<Employee>> result = obj.createEmployeeData();

        for(String var : result.keySet()){

            System.out.println("Company Name: "+var );
            ArrayList<Employee> employees =result.get(var);

            for(Employee std : employees){

                System.out.println("Name :"+std.getName() + " Age: "+std.getAge() +" EmpId: "+std.getEmpId());
            }

        }
    }
}
