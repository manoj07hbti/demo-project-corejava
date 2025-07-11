package java_collections.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Integer_Hashset {

    public HashSet<Integer> storeNumber(){
        //ClassName <DataType> objName= new ClassName<>();
        HashSet<Integer> numbers= new HashSet<>();
        numbers.add(123);
        numbers.add(123234);
        numbers.add(12423);
        numbers.add(12);
        numbers.add(123234);
        numbers.add(12423);
        numbers.add(1991);


        return numbers;


    }

    // Store Unique data Sequence wise
    public LinkedHashSet<Integer> storeUniqueNumber(){

        //ClassName <DataType> objName= new ClassName<>();
        LinkedHashSet<Integer> numbers= new LinkedHashSet<>();
        numbers.add(123);
        numbers.add(123234);
        numbers.add(12423);
        numbers.add(12);
        numbers.add(123234);
        numbers.add(12423);
        numbers.add(1991);


        return numbers;


    }

    // Main method
    public static void main(String[] args) {
        Integer_Hashset obj = new Integer_Hashset();

        // call method
        HashSet<Integer> result =obj.storeNumber();
        System.out.println(result);
        System.out.println("Unique Student Names with insertion order :"+obj.storeUniqueNumber());

        // Using advance for Loop

        for (Integer var: obj.storeNumber()){
            System.out.println("Using Advance Loop  Print Unique name :"+var);
        }
        for (Integer var: obj.storeUniqueNumber()){
            System.out.println("Using Advance Loop Print Unique name  with insertion:"+var);
        }

    }
}
