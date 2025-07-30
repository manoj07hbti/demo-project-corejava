package model;

import java.util.Objects;

public class Employee {

    String name;
    int age;
    String empID;
    String empDepart;

    // parameterised constructor


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(empID, employee.empID) && Objects.equals(empDepart, employee.empDepart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, empID, empDepart);
    }

    public Employee(String name, int age, String empID, String empDepart) {
        this.name = name;
        this.age = age;
        this.empID = empID;
        this.empDepart = empDepart;
    }

    // Getter and setter method


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public String getEmpDepart() {
        return empDepart;
    }

    public void setEmpDepart(String empDepart) {
        this.empDepart = empDepart;
    }
}
