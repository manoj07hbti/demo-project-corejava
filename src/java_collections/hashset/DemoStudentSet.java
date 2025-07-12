package java_collections.hashset;

import model.Student;

import java.util.HashSet;

public class DemoStudentSet {

    public void createStudentData(){

        HashSet<Student>  studentHashSet= new HashSet<>();

        // now we need to create data for Student

        Student s1= new Student("Raj",21,"CS");
        System.out.println( " Hashcode of S1 is "+s1.hashCode());
        Student s2= new Student("Rohit",22,"IT");
        System.out.println( " Hashcode of S2 is "+s2.hashCode());
        Student s3= new Student("Raj",21,"CS");
        System.out.println( " Hashcode of S3 is "+s3.hashCode());
        Student s4= new Student("Rohit",22,"IT");
        System.out.println( " Hashcode of S4 is "+s4.hashCode());
        Student s5= new Student("Mohi",23,"CS");
        System.out.println( " Hashcode of S5 is "+s5.hashCode());

        studentHashSet.add(s1);
        studentHashSet.add(s2);
        studentHashSet.add(s3);
        studentHashSet.add(s4);
        studentHashSet.add(s5);

        for(Student var: studentHashSet){

            System.out.println("Name: "+var.getName()+ " Age: "+var.getAge() +" Section: "+var.getSection());
        }

    }

    public static void main(String[] args) {

        DemoStudentSet obj= new DemoStudentSet();
        obj.createStudentData();
    }
}
