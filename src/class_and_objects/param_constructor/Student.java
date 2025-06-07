package class_and_objects.param_constructor;

import sun.swing.SwingUtilities2;

public class Student {

    //parameterized constructor
    //this points to current object
    String name;
    int rollNo;
    int age;
    String stream;

    public Student(String name, int rollNo , int age  ,  String stream ){
        this.name=name;
        this.rollNo=rollNo;
        this.age=age;
        this.stream=stream;
    }

    public static void main(String[] args) {
        Student student1 = new Student( "rahul",04, 21,"NonMeddical");
        Student student2 = new Student( "Atul",01, 23,"Meddical");
        Student student3 = new Student( "Akash",07, 19,"Arts");
        System.out.println( "information about students: " + " name: " + student1.name + " rollNo: "
                + student1.rollNo + " age: " + student1.age + " stream: " +student1.stream);
        System.out.println( "information about students: " + " name: " + student2.name + " rollNo: "
                + student2.rollNo + " age: " + student2.age + " stream: " +student2.stream);
        System.out.println( "information about students: " + " name: " + student3.name + " rollNo: "
                + student3.rollNo + " age: " + student3.age + " stream: " +student3.stream);


    }



}
