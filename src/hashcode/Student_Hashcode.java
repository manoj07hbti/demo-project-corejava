package hashcode;

import models.Student;

import java.util.HashSet;

public class Student_Hashcode {

    public void Student_Data(){


        HashSet<Student> StudentHashcode= new HashSet<>();

        Student s1= new Student("tarun",30,30.45,"MCA");
        System.out.println( " Hashcode of S1 is "+s1.hashCode());
        Student s2= new Student("ayaan",23,56.80,"BTech");
        System.out.println( " Hashcode of S2 is "+s2.hashCode());
        Student s3= new Student("tarun",30,30.45,"MCA");
        System.out.println( " Hashcode of S3 is "+s3.hashCode());
        Student s4= new Student("rohit",12,60.99,"BA");
        System.out.println( " Hashcode of S4 is "+s4.hashCode());
        Student s5= new Student("rahul",34,70.66,"MBA");
        System.out.println( " Hashcode of S5 is "+s5.hashCode());


        StudentHashcode.add(s1);
        StudentHashcode.add(s2);
        StudentHashcode.add(s3);
        StudentHashcode.add(s4);
        StudentHashcode.add(s5);

        for (Student list: StudentHashcode) {
            System.out.println("Name= " + list.getName() +" Roll No= "+ list.getRoll_No() + " Marks= "+ list.getMarks() + " Department= "+list.getDepartment());

        }
    }

    public static void main(String[] args) {

        Student_Hashcode obj= new Student_Hashcode();
        obj.Student_Data();
    }
}
