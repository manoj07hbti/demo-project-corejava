package java_collection.HashMap;

import model.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentHashMap {

    // we need to store data college wise

    // Key- College Name  value- ArrayList<Student> --- > Student

    public HashMap<String, ArrayList<Student>> createStudentData(){

        //create student data
        Student student1= new Student("Raj",21,"CS");
        Student student2= new Student("Rohi",21,"IT");
        Student student3= new Student("Mohit",22,"CS");

        //ArrayList of Student
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        HashMap <String, ArrayList<Student>> collegeWiseData= new HashMap<>();

        collegeWiseData.put("CollegeA",students);

        //create student data
        Student student4= new Student("Ketan",21,"CIVIL");
        Student student5= new Student("Jatin",21,"MECH");
        Student student6= new Student("Jeetesh",22,"CHEM");

        //ArrayList of Student
        ArrayList<Student> studentsB = new ArrayList<>();
        studentsB.add(student1);
        studentsB.add(student2);
        studentsB.add(student3);
        collegeWiseData.put("CollegeB",studentsB);
        return collegeWiseData;
    }


    public static void main(String[] args) {
        StudentHashMap obj= new StudentHashMap();
        HashMap <String, ArrayList<Student>> result=  obj.createStudentData();

        for(String var : result.keySet()){

            System.out.println("College Name: "+var );
            ArrayList<Student> students=result.get(var);
            System.out.println(students);
            for(Student std : students){

                System.out.println("Name :"+std.getName() + " Age: "+std.getAge() +" Section: "+std.getSection());
            }

        }

    }
}
