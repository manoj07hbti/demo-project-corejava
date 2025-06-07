package param_constructor;

public class Employee
{
    String name;
    int age;
    double salary;         //In lacs

    public Employee(String name, int age, double salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void main(String[] args)
    {
        Employee employeeOne = new Employee("Max", 22, 5.6);
        System.out.println("Name: " + employeeOne.name + ", Age: " + employeeOne.age + ", Salary: " + employeeOne.salary);
        Employee employeeTwo = new Employee("Eddie", 19, 4.9);
        System.out.println("Name: " + employeeTwo.name + ", Age: " + employeeTwo.age + ", Salary: " + employeeTwo.salary);
        Employee employeeThree = new Employee("Paul", 28, 6.2);
        System.out.println("Name: " + employeeThree.name + ", Age: " + employeeThree.age + ", Salary: " + employeeThree.salary);
    }
}
