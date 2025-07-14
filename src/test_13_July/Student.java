package test_13_July;

public class Student {

    String name;
    int roll_no;
    double marks;
    String branch;


    // Creating Constructor
    public Student(String name, int roll_no, double marks, String branch) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
        this.branch = branch;
    }


    // Creating getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
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
