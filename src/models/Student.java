package models;

import test_13_july.Student_List;

import java.util.Objects;

public class Student extends Student_List {

    String name;
    int roll_No;
    Double marks;
    String Department;


    public Student(String name, int roll_No, Double marks, String department) {
        this.name = name;
        this.roll_No = roll_No;
        this.marks = marks;
        Department = department;
    }

    // create Equals and HashCode for Student Class

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll_No == student.roll_No && Objects.equals(name, student.name) && Objects.equals(marks, student.marks) && Objects.equals(Department, student.Department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roll_No, marks, Department);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_No() {
        return roll_No;
    }

    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
