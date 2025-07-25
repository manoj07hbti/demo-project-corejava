package java_collections.hashmap;

import model.Student;

import java.util.HashMap;
import java.util.HashSet;

public class DemoCollegeData {

    public static void main(String[] args) {

        //1 - student data

        Student student1= new Student("Raj",21,"CS");
        Student student2= new Student("Rohit",21,"IT");
        Student student3= new Student("Mohit",22,"CS");
        Student student4= new Student("Ketan",21,"CIVIL");
        Student student5= new Student("Jatin",21,"MECH");
        Student student6= new Student("Jeetesh",22,"CHEM");
        Student student7= new Student("Raj",21,"CS");
        Student student8= new Student("Rohit",21,"IT");

        // to store Unique Students data we will use Hashset
        HashSet<Student> studentCollegeA=new HashSet<>();
        HashSet<Student> studentCollegeB=new HashSet<>();

        studentCollegeA.add(student1);
        studentCollegeA.add(student2);
        studentCollegeA.add(student3);
        studentCollegeA.add(student8);
        studentCollegeB.add(student4);
        studentCollegeB.add(student5);
        studentCollegeB.add(student6);
        studentCollegeB.add(student7);
        studentCollegeB.add(student1);

        //HashMap

        HashMap<String , HashSet<Student>> collegeData= new HashMap<>();

        collegeData.put("A",studentCollegeA);
        collegeData.put("B",studentCollegeB);

        System.out.println("Print All Students College wise");

        for(String key: collegeData.keySet()){

            for(Student var : collegeData.get(key)){
             // Print all those student with CS branch
                if(var.getSection().equals("CS")) {
                    System.out.println("Printing Data for College- " + key + " Name:" + var.getName() + " Age: " + var.getAge() + " Section: " + var.getSection());
                }
            }

        }

    }

}
