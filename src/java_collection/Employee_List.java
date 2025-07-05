package java_collection;

import java.util.ArrayList;

public class Employee_List {

    public ArrayList employeeList(){


        ArrayList lists= new ArrayList();

        lists.add("Employee1"+" salary= "+25000);
        lists.add("Employee2"+" salary= "+27000);
        lists.add("Employee3"+" salary= "+21000);
        lists.add("Employee4"+" salary= "+29000);
        lists.add("Employee5"+" salary= "+52000);
        lists.add("Employee6"+" salary= "+32000);
        lists.add("Employee7"+" salary= "+34000);
        lists.add("Employee8"+" salary= "+19000);
        lists.add("Employee9"+" salary= "+40000);
        lists.add("Employee10"+" salary= "+22000);

        return lists;
    }

    public static void main(String[] args) {

        Employee_List obj= new Employee_List();
        ArrayList list= obj.employeeList();

// using for loop

        System.out.println("Using For Loop ");
        System.out.println();
        for (int i=0; i< list.size(); i++) {
            System.out.println( list.get(i));
        }

        list.remove(1);
        list.remove(2);
        list.remove(3);

        System.out.println();
        System.out.println("After removing First 3 names from for loop ");
        System.out.println();

        for (int i=0; i< list.size(); i++) {
            System.out.println( list.get(i));
        }

//   using while loop

        System.out.println();
        System.out.println("While Loop ");
        System.out.println();
        int k=0;
        while (k< list.size()) {
            System.out.println( k+" "+list);
            k++;
        }
        list.remove(6);
        list.remove(7);

        System.out.println();
        System.out.println("After removing First 2 names from while loop ");
        System.out.println();

        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

//  using DO While loop

        System.out.println();
        System.out.println("Do While Loop");
        System.out.println();
        int j=0;
        do {
            System.out.println(j+" "+list);
            j++;
        }while (j< list.size());

        list.remove(0);

        System.out.println();
        System.out.println("After removing First 1 name from DO While ");
        System.out.println();

        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}

