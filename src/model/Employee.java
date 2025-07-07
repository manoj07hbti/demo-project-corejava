package model;

public class Employee {

    String name;
    int age;
    String empId;

    //create param constructor

    public Employee(String name, int age, String empId) {
        this.name = name;
        this.age = age;
        this.empId = empId;
    }

    // getter and setter


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

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
}
