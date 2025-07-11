package java_collections.hashset;

import javax.sound.midi.Soundbank;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class String_Hashset {

    public HashSet<String> storeStudent(){
        //ClassName <DataType> objName= new ClassName<>();
        HashSet<String> students= new HashSet<>();
        students.add("Neeshu");
        students.add("Rahul");
        students.add("Teena");
        students.add("Neeshu");
        students.add("Neeshu");
        students.add("Zafar");
        students.add("Suraj Gautam");

        return students;


    }

    // Store Unique data Sequence wise
    public LinkedHashSet<String> storeUniqueStudent(){

        //ClassName <DataType> objName= new ClassName<>();
        LinkedHashSet<String> students= new LinkedHashSet<>();
        students.add("Neeshu");
        students.add("Rahul");
        students.add("Teena");
        students.add("Neeshu");
        students.add("Neeshu");
        students.add("Zafar");
        students.add("Suraj Gautam");

        return students;

    }

    // Main method
    public static void main(String[] args) {
        String_Hashset obj = new String_Hashset();

        // call method
        HashSet<String> result =obj.storeStudent();
        System.out.println(result);
        System.out.println("Unique Student Names with insertion order :"+obj.storeUniqueStudent());

    // Using advance for Loop

        for (String var: obj.storeStudent()){
        System.out.println("Using Advance Loop  Print Unique name :"+var);
         }

        for (String var: obj.storeUniqueStudent()){
            System.out.println("Using Advance Loop Print Unique name  with insertion:"+var);
        }

    }

}
