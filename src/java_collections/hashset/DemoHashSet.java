package java_collections.hashset;

import git.Demo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DemoHashSet {

    //write a code to store course name
    public HashSet<String> createCourseData(){
        //ClassName <DataType> objName= new ClassName<>();
        HashSet<String> course= new HashSet<>();
        course.add("Java");
        course.add("Spring Boot");
        course.add("Microservice");
        course.add("Cloud");
        course.add("Java");
        course.add("Spring Boot");
        course.add("Microservice");

      return  course;
    }

  // we want to store unique data and also maintain insertion order
    //LinkedHashSet

    public  LinkedHashSet <String> storeUniqueCourse(){
        LinkedHashSet <String> course= new LinkedHashSet<>();
        course.add("java");
        course.add("Spring");
        course.add("Spring Boot");
        course.add("Microservices");

        return course;

    }


    public static void main(String[] args) {

        DemoHashSet obj= new DemoHashSet();
        HashSet<String> output=obj.createCourseData();
        System.out.println(output);

        System.out.println("Unique course with insertion order : "+obj.storeUniqueCourse());

        for(String var : obj.storeUniqueCourse()){

            System.out.println("Course name is :"+var);
        }
    }
}
