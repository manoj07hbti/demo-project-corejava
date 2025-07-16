package modal;

public class Student1 {
    String name;
    int rollNo;
    int marks;
    String branch;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollno(int rollno) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Student1(String name, int rollno, int marks, String branch) {
        this.name = name;
        this.rollNo = rollno;
        this.marks = marks;
        this.branch = branch;
    }
}
