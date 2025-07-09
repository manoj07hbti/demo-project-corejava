package models;

public class StudentList {

    String name;
    String studentId;
    int age;
    int rollNo;

// param constructor


    public StudentList(String name, String studentId, int age, int rollNo) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
        this.rollNo = rollNo;
    }


    // create getter and setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
