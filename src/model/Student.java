package model;

public class Student {

    String studentId;
    String name;
    long phoneNumber;
    String department;

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
