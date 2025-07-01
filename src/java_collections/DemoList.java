package java_collections;

import git.Demo;

import java.util.ArrayList;
import java.util.Scanner;

public class DemoList {

    // create a method which will store information and send back

    public ArrayList storeInfo(){

        //ClassName objName= new ClassName();
        ArrayList list= new ArrayList();

        list.add("Raj");
        list.add(21);
        list.add(2323.22);
        list.add(true);


      return list;
    }



    public static void main(String[] args) {
       DemoList obj = new DemoList();
       ArrayList list= obj.storeInfo();

       // get(INDEX) == value
       for(int i=0; i<list.size(); i++){

           System.out.println("Printing list using for loop at : "+ i +" Value: "+list.get(i));
       }
       //TODO : do it using while loop and do while loop
       // for(Datatype var: collection/array)
       for(Object var: list){
           System.out.println("Printing using Advanced loop..."+var);
       }

       // list.remove(INDEX)

        list.remove(0);
        System.out.println("AFTER REMOVAL OS ELEMENTS ");
        for(int i=0; i<list.size(); i++){

            System.out.println("Printing list using for loop at : "+ i +" Value: "+list.get(i));
        }
    }
}
