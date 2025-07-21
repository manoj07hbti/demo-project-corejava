package java_collections.hashmap;

import java.util.HashMap;
import java.util.Set;

public class DemoHashMap {


    public static void main(String[] args) {
      /*TODO 1- create a method which will create map and return
             2- use scanner to take input, ask user to continue or stop
             3- enter value and add to map
       */

     //   HashMap <DataType_Key, DataType_Value> objName= new HashMap();
     //   Store Course name and Number of Days taken by any course

        HashMap <String,Integer> courses= new HashMap<>();
        // adding a value into map  map.put(key, Value);
        courses.put(null,1000);  // map allows one key as null
        courses.put(null,9999);
        courses.put("Java", 90);
        courses.put("Java", 100);
        courses.put("Spring",60);
        courses.put("Spring Boot", 45);
      // how to read value map.get(key)
        System.out.println("Spring Boot Duration is : " +courses.get("Spring Boot"));
        System.out.println("All courses details "+courses);

       //map.keySet(); // it will return all the Keys of HashMap as Set collection

       Set<String> keys=  courses.keySet();
       // for (Datatype var : collection/Array)

        for(String var :keys){
            System.out.println("Printing Map using keys: "+courses.get(var));
        }
      //TODO check other two way to print hashMap using loop

    }



}
