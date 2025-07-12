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

    public void demoHashCode(){

        String s1= "Hello";
        System.out.println( " Hashcode of S1 is "+s1.hashCode());
        String s2= "Hello";
        System.out.println( " Hashcode of S2 is "+s2.hashCode());
        String s3= "Java";
        System.out.println( " Hashcode of S3 is "+s3.hashCode());
        String s4="World";
        System.out.println( " Hashcode of S4 is "+s4.hashCode());
        String s5="World";
        System.out.println( " Hashcode of S5 is "+s5.hashCode());

        HashSet<String> message= new HashSet<>();
        message.add(s1);
        message.add(s2);
        message.add(s3);
        message.add(s4);
        message.add(s5);

        System.out.println("Printing HashSet "+message);

    }


    public static void main(String[] args) {

        DemoHashSet obj= new DemoHashSet();
        HashSet<String> output=obj.createCourseData();
       // System.out.println(output);

        obj.demoHashCode();
        System.out.println("Unique course with insertion order : "+obj.storeUniqueCourse());

     /*   for(String var : obj.storeUniqueCourse()){

            System.out.println("Course name is :"+var);
        }*/
    }
}
