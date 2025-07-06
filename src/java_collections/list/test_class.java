package java_collections.list;

import java.util.ArrayList;

public class test_class {

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

            test_class obj = new test_class();
            ArrayList list=obj.store();

            for (int i=0; i< list.size();i++){
                System.out.println("Printing by For Loop " + i + ": " + list.get(i));
            }
        }
    }
