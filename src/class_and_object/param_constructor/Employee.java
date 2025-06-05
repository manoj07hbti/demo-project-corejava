package class_and_object.param_constructor;

import com.sun.jdi.PathSearchingVirtualMachine;

public class Employee {

    String name;
    String company;
    String work;
    int salary;

    public Employee(String name, String company, String work, int salary) {
        this.name = name;
        this.company = company;
        this.work = work;
        this.salary = salary;

        }

    public static void main(String[] args) {

        Employee OBJ1= new Employee("neeraj ","congizant ","IT ",25000);

        System.out.println(OBJ1.name+OBJ1.company+OBJ1.work+OBJ1.salary);

        Employee OBJ2= new Employee("PRIYA ","Global ","web developer ",55000);

        System.out.println(OBJ2.name+OBJ2.company+OBJ2.work+OBJ2.salary);

    }


    }

