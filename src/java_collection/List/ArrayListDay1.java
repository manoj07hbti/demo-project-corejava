package java_collection.List;

import java.util.ArrayList;

public class ArrayListDay1 {

    //Create one Arraylist object and add 20 elements
    //1. Add
    //2. Get and print all using for loop, while, do while
    //3. Remove and print all using for loop, while, do while
    //Advanced loop

     public ArrayList element(){

          ArrayList List=new ArrayList();

          List.add("NEERAJ");
          List.add("24");
          List.add("Reasi");
          List.add("Graduated");
          List.add("NEERAJ");
          List.add("Photographer");
          List.add("Gamer");
          List.add("NEERAJ");
          List.add("lenovo thinkpad");
          List.add("NEERAJ");

          return List;
     }

     public static void main(String[] args){


          ArrayListDay1 OBJ= new ArrayListDay1();
          ArrayList List=OBJ.element();

          for(int i=0; i< List.size(); i++){

            System.   out.println("Printing list using for loop at : "+ i +" Value: "+List.get(i));
          }

          int n=0;
          while (n<List.size()){
               System.   out.println("Printing list using for While loop at : "+ n +" Value: "+List.get(n));
               n++;
          }

          int m=0;
          do {
               System.   out.println("Printing list using for DO loop at : "+ m +" Value: "+List.get(m));
               m++;
          }while (m<List.size());

          for(Object var: List){
               System.out.println("Printing using Advanced loop..."+var);
          }



          //removal

          List.remove(4);
          List.remove(8);


          System.out.println("AFTER REMOVAL ELEMENTS....... ");

          for(int i=0; i< List.size(); i++){

               System.out.println("Printing list using for loop at : "+ i +" Value: "+ List.get(i));
          }


     }

}
