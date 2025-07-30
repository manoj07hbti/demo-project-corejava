package model;

import java.util.Objects;

public class Student {

    String studentId;
    String name;
    long phoneNumber;
    String department;

    //hashcode and Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return phoneNumber == student.phoneNumber && Objects.equals(studentId, student.studentId) && Objects.equals(name, student.name) && Objects.equals(department, student.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, name, phoneNumber, department);
    }

    public Student(String studentId, String name, long phoneNumber, String department) {
        this.studentId = studentId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.department = department;
    }

    // Getter and setter

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}