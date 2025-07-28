package java_collections.hashmap_modal;

import model.Students;

import java.util.HashMap;
import java.util.HashSet;

public class DemoCollegeData {

    public static void main(String[] args) {

        //1 - student data

        Students student1= new Students("Raj",21,35,46.0,"CS");
        Students student2= new Students("Rahul",22,34,60.0,"IT");
        Students student3= new Students("Tannu",1,30,78.0,"Civil");
        Students student4= new Students("Neeshu",10,17,46.0,"CS");
        Students student5= new Students("Rishu",10,17,56.0,"Spring Boot");
        Students student6= new Students("Pooja",10,17,33.0,"Commerce");
        Students student7= new Students("Raj",21,35,46.0,"CS");
        Students student8= new Students("Raj",21,35,46.0,"CS");

        // to store Unique Students data we will use Hashset
        HashSet<Students> studentCollegeA=new HashSet<>();
        HashSet<Students> studentCollegeB=new HashSet<>();

        studentCollegeA.add(student1);
        studentCollegeA.add(student2);
        studentCollegeA.add(student3);
        studentCollegeA.add(student8);
        studentCollegeB.add(student4);
        studentCollegeB.add(student5);
        studentCollegeB.add(student6);
        studentCollegeB.add(student7);
        studentCollegeB.add(student8);

        //HashMap

        HashMap<String, HashSet<Students>> collegeData= new HashMap<>();

        collegeData.put("A",studentCollegeA);
        collegeData.put("B",studentCollegeB);

        System.out.println("Print All Students College wise");

        for(String key: collegeData.keySet()){

            for(Students var : collegeData.get(key)){
                // Print all those student with CS branch
                if(var.getBranch().equals("CS")) {
                    System.out.println("Printing Data for College- " + key + " Name:" + var.getName() + " Roll No: " + var.getRollNo() + " Age: " + var.getAge() + " Marks: " + var.getMarks() +" Branch: " + var.getBranch());
                }
            }

        }

    }

}