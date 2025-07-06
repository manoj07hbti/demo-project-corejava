package java_collections.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Scanner {

    public ArrayList nameElement() {

        ArrayList nameList = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 20 elements to add to the ArrayList:");

        // Add 20 elements using Scanner)
        for (int i = 0; i<10; i++) {
            System.out.print("Enter element #" + (i+1 ) + ": ");
            String element = scanner.nextLine();
            nameList.add(element);
        }

        return nameList;
    }

    public static void main(String[] args) {

        ArrayList_Scanner obj =new ArrayList_Scanner();
        ArrayList list =obj.nameElement();

        //Using For Loop
        for (int i=0; i<10;i++){
            System.out.println("Using For loop Print element # :"+list.get(i));
        }

        System.out.println("\n");
        System.out.println("***************************** While Loop *****************************");
        // While Loop
        int k=0;
        while (k< 10){
            System.out.println("Using for While Loop Print element #: "+k +" "+list.get(k));
            k++;
        }

        System.out.println("\n");
        System.out.println("***************************** Do while Loop *****************************");
        // Using Do while
        int a=0;
        do {
            System.out.println("Using for do While Loop Print element #: "+a +" "+list.get(a));
            a++;
        }while (a<10);

        // Using advance for Loop

        System.out.println("\n");
        System.out.println("*****************************Advance For Loop*****************************");
        // for (DataType var :collection/Array
        for (Object storeName :list){
            System.out.println("Using for Advance For Loop Print element #: "+storeName);
        }
    }
}
