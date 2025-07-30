package model;

import java.util.Objects;

public class Students {

        String name;
        int rollNo;
        int age;
        double marks;
        String branch;

        // Hashcode and equal


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return rollNo == students.rollNo && age == students.age && Double.compare(marks, students.marks) == 0 && Objects.equals(name, students.name) && Objects.equals(branch, students.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNo, age, marks, branch);
    }

    public Students(String name, int rollNo, int age, double marks, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.marks = marks;
        this.branch = branch;
    }

    //Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
