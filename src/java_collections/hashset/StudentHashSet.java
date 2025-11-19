package java_collections.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

import modal.Student;

public class StudentHashSet {

    public void createStudentData(){

        
        LinkedHashSet<Student> studentHashSet = new LinkedHashSet<>();

        Student s1 = new Student("harish", 12, "d");
        System.out.println("Hashcode of s1 is: " + s1.hashCode());
        Student s2 = new Student("raj", 14, "d");
        System.out.println("Hashcode of s2 is: " + s2.hashCode());
        Student s3 = new Student("harry", 15, "d");
        System.out.println("Hashcode of s3 is: " + s3.hashCode());
        Student s4 = new Student("suraj", 16, "d");
        System.out.println("Hashcode of s4 is: " + s4.hashCode());
        Student s5 = new Student("vinay", 13, "d");
        System.out.println("Hashcode of s5 is: " + s5.hashCode());
        Student s6 = new Student("vinay", 13, "d");
        System.out.println("Hashcode of s6 is: " + s6.hashCode());
        Student s7 = new Student("raj", 14, "d");
        System.out.println("Hashcode of s7 is: " + s7.hashCode());


        studentHashSet.add(s1);
        studentHashSet.add(s2);
        studentHashSet.add(s3);
        studentHashSet.add(s4);
        studentHashSet.add(s5);
        studentHashSet.add(s6);
        studentHashSet.add(s7);


        for (Student var: studentHashSet){
            System.out.println("Name : " + var.getName() + " Age: " + var.getAge() + " Section: " + var.getSection());
        }
    }

    public static void main(String[] args) {
        StudentHashSet obj = new StudentHashSet();
        obj.createStudentData();
    }
}
