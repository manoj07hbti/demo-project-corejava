package class_object_practice;

public class Employee_Parameter {

    // Declare Variable
    int employeeId;
    String name;
    String department;
    double salary;
    boolean isFullTime;

    // Parameter Constructor


    public Employee_Parameter(int employeeId, String name, String department, double salary, boolean isFullTime) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.isFullTime = isFullTime;

    }

    public static void main(String[] args) {
        // Create employee objects using parameterized constructor
        Employee_Parameter emp1=new Employee_Parameter(001,"Neeshu Bhadauriya","Operation",89000,true);
        Employee_Parameter emp2=new Employee_Parameter(003,"Khushboo Sachdeva","Language Translate",120000,false);
        Employee_Parameter emp3=new Employee_Parameter(006,"Tannu","IT Engineering",95000,true);
        Employee_Parameter emp4=new Employee_Parameter(010,"Rishab","Sales & Marketing",45000,true);


        System.out.println("=================================");
        System.out.println("Employee ID : "+emp1.employeeId);
        System.out.println("Employee Name : "+emp1.name);
        System.out.println("Department : "+emp1.department);
        System.out.println("Salary : "+emp1.salary);
        System.out.println("Full Time: " + (emp1.isFullTime ? "Yes" : "No"));

        System.out.println("=================================");
        System.out.println("Employee ID : "+emp2.employeeId);
        System.out.println("Employee Name : "+emp2.name);
        System.out.println("Department : "+emp2.department);
        System.out.println("Salary : "+emp2.salary);
        System.out.println("Full Time: " + (emp2.isFullTime ? "Yes" : "No"));

        System.out.println("=================================");
        System.out.println("Employee ID : "+emp3.employeeId);
        System.out.println("Employee Name : "+emp3.name);
        System.out.println("Department : "+emp3.department);
        System.out.println("Salary : "+emp3.salary);
        System.out.println("Full Time: " + (emp3.isFullTime ? "Yes" : "No"));

        System.out.println("=================================");
        System.out.println("Employee ID : "+emp4.employeeId);
        System.out.println("Employee Name : "+emp4.name);
        System.out.println("Department : "+emp4.department);
        System.out.println("Salary : "+emp4.salary);
        System.out.println("Full Time: " + (emp4.isFullTime ? "Yes" : "No"));


    }
}
