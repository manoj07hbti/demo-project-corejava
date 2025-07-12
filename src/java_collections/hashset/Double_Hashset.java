package java_collections.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Double_Hashset {

    public HashSet<Double> storeHeight(){
        //ClassName <DataType> objName= new ClassName<>();
        HashSet<Double> height= new HashSet<>();
        height.add(44.56);
        height.add(50.56);
        height.add(41.56);
        height.add(50.56);
        height.add(55.56);
        height.add(76.35);
        height.add(55.56);


        return height;


    }

    // Store Unique data Sequence wise
    public LinkedHashSet<Double> storeUniqueHeight(){

        //ClassName <DataType> objName= new ClassName<>();
        LinkedHashSet<Double> height= new LinkedHashSet<>();
        height.add(44.56);
        height.add(50.56);
        height.add(41.56);
        height.add(50.56);
        height.add(55.56);
        height.add(76.35);
        height.add(55.56);


        return height;


    }

    // Main method
    public static void main(String[] args) {
        Double_Hashset obj = new Double_Hashset();

        // call method
        HashSet<Double> result =obj.storeHeight();
        System.out.println(result);
        System.out.println("Unique Student Names with insertion order :"+obj.storeUniqueHeight());

        // Using advance for Loop

        for (Double var: obj.storeHeight()){
            System.out.println("Using Advance Loop  Print Unique Heights :"+var);
        }
        for (Double var: obj.storeUniqueHeight()){
            System.out.println("Using Advance Loop Print Unique Heights with insertion:"+var);
        }

    }
}
