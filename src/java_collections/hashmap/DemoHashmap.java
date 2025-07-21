package java_collections.hashmap;

import java.util.HashMap;

public class DemoHashmap {


    public static void main(String[] args) {

        //Syntax:
        //HashMap <DataType_Key, DataType_Value> doctorHashSet = new HashSet<>();

        // write a code for Store Course Name,Duration (day)
        HashMap <String,Integer> course = new HashMap<>();

        // add value and key map.put
        course.put("English Speaking",120);
        course.put("SSC",150);
        course.put("SSC",120);
        course.put("UPSC Coaching",200);
        System.out.println("English Speaking course duration is :"+ course.get("English Speaking"));

        // Print all course along with duration
        System.out.println("All course : "+course);


    }


}
