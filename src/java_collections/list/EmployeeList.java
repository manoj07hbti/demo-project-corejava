package java_collections.list;

import modal.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {

    public Employee createEmployee(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter name: ");
        String name=scanner.nextLine();
        System.out.println("Please enter Age: ");
        int age= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter empId : ");
        String empId= scanner.nextLine();

        Employee employee= new Employee(name,age,empId);

        return employee;
    }

    public static void main(String[] args) {

        // write a logic to call create employee data based on user choice and add to the List
        //CollectionName <Datatype> objName = new CollectionName<>();
        ArrayList<Employee> employeesList= new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        EmployeeList obj= new EmployeeList();
        boolean flag=true;
        while (flag==true){
            Employee employeeObj=obj.createEmployee();
            employeesList.add(employeeObj);
            System.out.println("Do you want to add more Students ? press Y to continue or any other key to exit...");
            String choice=scanner.nextLine();
            if(!(choice.equals("Y"))){
                flag=false;
            }
        }

        //for(DataType var : array/Collection){ }
        for (Employee var: employeesList){
            System.out.println("Name: "+var.getName() + " Age: "+var.getAge()+" EmpId "+var.getEmpId());
        }
    }
}
