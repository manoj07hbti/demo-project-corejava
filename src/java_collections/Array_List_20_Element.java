package java_collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_20_Element {

    //Create one Arraylist object and add 20 elements
       // 1. add
        //2. get and print all using for loop , while , do while
        //3. remove and print all using for loop , while , do while
    //      Advanced loop

    public ArrayList storeName(){

        ArrayList list =new ArrayList();

        list.add("Neeshu");
        list.add("Rahul");
        list.add("Suraj");
        list.add("Sarvesh");
        list.add("Vijo Mthew");
        list.add("Shweta");
        list.add("Abhishek");
        list.add("Shaumya");
        list.add("Varun");
        list.add("Omika");
        list.add("Jaideep");
        list.add("Krishna");
        list.add("Anjali");
        list.add("Teena");
        list.add("Khushboo");
        list.add("Tarun");
        list.add("Rakesh");
        list.add("Sumit");
        list.add("Rinky");
        list.add("Hitesh");

        return list;

    }

    public static void main(String[] args) {

        //Create Object for Call Array list
        Array_List_20_Element obj = new Array_List_20_Element();
        ArrayList list = obj.storeName();
        System.out.println("Printing Elements :"+list);

        System.out.println("\n");
        // USing Loop
        for (int i=0;i< list.size();i++){
            System.out.println("Using for Loop Print element #: "+i +" "+list.get(i));
        }

        System.out.println("\n");
        // While Loop}
        int k=0;
        while (k< list.size()){
            System.out.println("Using for While Loop Print element #: "+k +" "+list.get(k));
            k++;
        }
        System.out.println("\n");
        list.remove(5);
        list.remove(10);
        list.remove(15);
        list.remove(7);

        System.out.println("\n");
        // Using Do while
        int a=0;
        do {
            System.out.println("Using for do While Loop Print element #: "+a +" "+list.get(a));
            a++;
        }while (a<list.size());

        System.out.println("\n");
        // Using advance for Loop

        // for (DataType var :collection/Array
        for (Object storeName :list){
            System.out.println("Using for Advance For Loop Print element #: "+storeName);
        }



    }
}
