package java_collections.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class IntegerHashSet {
    public HashSet <Integer> addSalaryGiven(){
        HashSet <Integer> salary = new HashSet<>();
        salary.add(1000);
        salary.add(2000);
        salary.add(5000);
        salary.add(3000);
        salary.add(5000);
        salary.add(7000);
        salary.add(2000);
         return salary;
    }
     public LinkedHashSet <Integer> storeUniqueSalary(){
         LinkedHashSet <Integer> salary = new LinkedHashSet<>();
         salary.add(1000);
         salary.add(2000);
         salary.add(3000);
         salary.add(5000);
         salary.add(3000);
         salary.add(2000);
         salary.add(7000);
         return salary;
     }

    public static void main(String[] args) {
        IntegerHashSet obj = new IntegerHashSet();
        HashSet <Integer> output = obj.addSalaryGiven();
        System.out.println(output);

        for(Integer var: obj.storeUniqueSalary()){
            System.out.println("Course name is:" + var);
        }

    }
}
