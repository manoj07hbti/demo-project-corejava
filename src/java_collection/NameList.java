package java_collection;

import java.util.ArrayList;

public class NameList {


    public ArrayList store(){

        ArrayList name= new ArrayList();

        name.add("tarun");
        name.add("ayush");
        name.add("rahul");
        name.add("sonia");
        name.add("prince");
        name.add("jai");
        name.add("roshni");
        name.add("riya");
        name.add("varun");
        name.add("kunal");

        return name;
    }
    public static void main(String[] args) {

        NameList obj= new NameList();
       ArrayList list= obj.store();

//  using for loop

       for (int i=0; i< list.size(); i++) {
           System.out.println("print names using for loop " + i + " " + list.get(i));
       }

        list.remove(0);
        list.remove(1);
        list.remove(2);

        System.out.println();
        System.out.println("After removing First 3 names from for loop ");
        System.out.println();

        for (int i=0; i< list.size(); i++) {
            System.out.println("print names using for loop " + i + " " + list.get(i));
        }

//   using while loop

        System.out.println();
        int k=0;
        while (k< list.size()) {
            System.out.println("using while loop " + k+" "+list);
            k++;
        }
        list.remove(0);
        list.remove(1);

        System.out.println();
        System.out.println("After removing First 2 names from while loop ");
        System.out.println();

        for (int i=0; i< list.size(); i++){
            System.out.println("print names using for While Loop "+ i+" "+ list.get(i));
        }

//  using DO While loop

        System.out.println();
        int j=0;
        do {
            System.out.println("Using Do While loop "+ j+" "+list);
            j++;
        }while (j< list.size());

        list.remove(0);

        System.out.println();
        System.out.println("After removing First 1 name from DO While ");
        System.out.println();

        for (int i=0; i< list.size(); i++){
            System.out.println("print names using for DO While Loop "+ i+" "+ list.get(i));
        }

    }
}
