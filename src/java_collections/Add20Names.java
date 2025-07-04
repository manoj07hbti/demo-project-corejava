package java_collections;
import java.util.ArrayList;


public class Add20Names {


        //Create one Arraylist object and add 20 elements
        // 1. add
        //2. get and print all using for loop , while , do while
        //3. remove and print all using for loop , while , do while
        //      Advanced loop

        public ArrayList storeName(){

            ArrayList list =new ArrayList();

            list.add("Harish");
            list.add("Raj");
            list.add("Suman");
            list.add("Sarthak");
            list.add("Vijay");
            list.add("Ravi");
            list.add("Abhishek");
            list.add("Pooja");
            list.add("Varun");
            list.add("Onkar");
            list.add("Amit");
            list.add("Krishna");
            list.add("Aarti");
            list.add("Tara");
            list.add("Khushi");
            list.add("Tarun");
            list.add("Rohit");
            list.add("Sanjeev");
            list.add("Riya");
            list.add("Himanshu");

            return list;

        }

        public static void main(String[] args) {

            //Create Object for Call Array list
            Add20Names obj = new Add20Names();
            ArrayList list = obj.storeName();
            System.out.println("Printing Elements :"+list);

            // USing For Loop
            for (int i=0;i< list.size();i++){
                System.out.println("Using for Loop Print element #: "+i +" "+list.get(i));
            }


            // While Loop}
            int k=0;
            while (k< list.size()){
                System.out.println("Using for While Loop Print element #: "+k +" "+list.get(k));
                k++;
            }

            // Using Do while
            int a=0;
            do {
                System.out.println("Using for Do While Loop Print element #: "+a +" "+list.get(a));
                a++;
            }while (a<list.size());

            // Using advance for Loop

            // for (DataType var :collection/Array
            for (Object storeName :list){
                System.out.println("Using for Advance For Loop Print element #: "+storeName);
            }
        }
    }
