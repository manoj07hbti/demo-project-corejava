package java_collections;

import java.util.ArrayList;

public class AddRemoveInCollection {
    //Create one Arraylist object and add 20 elements
    //1. add
    //2. get and print all using for loop , while , do while
    //3. remove and print all using for loop , while , do while
    //Advanced loop

    public ArrayList elements(){
        ArrayList list=new ArrayList();
       list.add("rohan");
       list.add(22);
       list.add("jammu");
       list.add(6.4);
       list.add(true);
       list.add("amit");
       list.add(9797647710l);
       list.add("delhi");
       list.add(8006.32);
       list.add(33);
       list.add("aman");
       list.add(7002573342l);
       list.add(5.3);
       list.add(false);
       list.add(941.40);
       list.add(166);
       list.add("ayush");
       list.add(9338028832l);
       list.add(100);
       list.add("pune");

     return list;
    }

    public static void main(String[] args) {
    AddRemoveInCollection obj=new AddRemoveInCollection();
     ArrayList list=obj.elements();

     for (int i=0;i< list.size();i++) {
         System.out.println("printing elements using for loop :" + list.get(i));
     }

     int i=0;
     while (i<list.size()){
            System.out.println("printing elements using while loop :" + list.get(i));
            i++;
        }

     int a=0;
     do {
         System.out.println("printing elements using dowhile loop :" + list.get(a));
         a++;
     }while (a< list.size());

     for (Object var: list){
         System.out.println("printing elements using advance loop :"+var);
     }

     list.remove(5);
            System.out.println("PPRINTING AFTER REMOVE USING FOR LOOP :");
        for (int b=0;b< list.size();b++) {
            System.out.println( list.get(b));
        }

     list.remove(3);
        System.out.println("PPRINTING AFTER REMOVE USING WHIE LOOP :");
        int c=0;
        while (c<list.size()) {
            System.out.println(list.get(c));
            c++;
        }
     list.remove(16);
        System.out.println("PPRINTING AFTER REMOVE USING DOWHIE LOOP :");
        int d=0;
        do {
            System.out.println(list.get(d));
            d++;
        }while (d< list.size());
     list.remove(12);
        System.out.println("PPRINTING AFTER REMOVE USING ADVANCED LOOP :");
        for (Object var:list){
            System.out.println(var);
        }
    }
}
