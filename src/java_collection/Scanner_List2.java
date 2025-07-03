package java_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Scanner_List2 {


    public ArrayList numbers(){

        ArrayList number= new ArrayList();
        System.out.println("print 20 numbers ");
        for (int i=0; i< 20; i++){
            Scanner obj= new Scanner(System.in);
          int num = obj.nextInt();
            number.add(num);
        }
        return number;
    }

    public static void main(String[] args) {

        Scanner_List2 obj2= new Scanner_List2();
        ArrayList number= obj2.numbers();


//  using for loop
        for (int i =0; i< number.size(); i++){
            System.out.println("print numbers using for loop= "+number.get(i));
        }

//  using While loop
        System.out.println();
        int j=0;
        while (j< number.size()){
            System.out.println("print numbers using for While loop= "+number.get(j));
            j++;
        }

//  using DO While loop
        System.out.println();
        int k=0;
        do {
            System.out.println("print numbers using for DO While loop= "+number.get(k));
            k++;
        }while (k< number.size());

//  using advance loop
        System.out.println();
        for (Object num: obj2.numbers()){
            System.out.println("print numbers using Advance loop= "+num);
        }
    }

}

