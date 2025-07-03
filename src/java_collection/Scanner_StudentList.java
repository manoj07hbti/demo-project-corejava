package java_collection;

import object_and_class.StudentClass;

import java.util.ArrayList;
import java.util.Scanner;

public class Scanner_StudentList {

    public ArrayList Studentlist() {

        ArrayList name = new ArrayList();
        System.out.println("enter 10 names");
        for (int i = 0; i <= 10; i++) {
            Scanner obj = new Scanner(System.in);
            String nam = obj.nextLine();
            name.add(nam);

        }
        return name;
    }

        public static void main (String[]args){

            Scanner_StudentList obj2 = new Scanner_StudentList();
            ArrayList list= obj2.Studentlist();

//  using for loop
            for (int i =0; i< list.size(); i++){
                System.out.println("print names using for loop= "+i+" "+list.get(i));
            }

//  using While loop
            System.out.println();
            int j=0;
            while (j< list.size()){
                System.out.println("print names using for While loop= "+j+" "+list.get(j));
                j++;
            }

//  using DO While loop
            System.out.println();
            int k=0;
            do {
                System.out.println("print names using for DO While loop= "+k+" "+list.get(k));
                k++;
            }while (k< list.size());

//  using advance loop
            System.out.println();
            for (Object names: obj2.Studentlist()){
                System.out.println("print names using Advance loop"+names);
            }
        }

}
