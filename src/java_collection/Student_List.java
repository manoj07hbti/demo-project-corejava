package java_collection;

import java.util.ArrayList;

public class Student_List {

    public ArrayList lists(){

        ArrayList name =new ArrayList();

        name.add("Student1"+"From Section A");
        name.add("Student2"+"From Section A");
        name.add("Student3"+"From Section B");
        name.add("Student4"+"From Section C");
        name.add("Student5"+"From Section C");
        name.add("Student6"+"From Section D");
        name.add("Student7"+"From Section D");
        name.add("Student8"+"From Section D");
        name.add("Student9"+"From Section E");
        name.add("Student10"+"From Section E");

        return name;
    }

    public static void main(String[] args) {

       Student_List obj= new Student_List();
       ArrayList list= obj.lists();

//  using for loop

        for (int i=0; i< list.size(); i++) {
            System.out.println("print names using for loop " + i + " " + list.get(i));
        }

        list.remove(0);
        list.remove(1);

        System.out.println();
        System.out.println("After removing First 2 names from for loop ");
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
        list.remove(1);
        list.remove(3);

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

        list.remove(3);
        list.remove(4);

        System.out.println();
        System.out.println("After removing First 1 name from DO While ");
        System.out.println();

        for (int i=0; i< list.size(); i++){
            System.out.println("print names using for DO While Loop "+ i+" "+ list.get(i));
        }

    }
}


