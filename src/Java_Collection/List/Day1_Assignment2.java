package Java_Collection.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Day1_Assignment2 {

    public ArrayList Student(){
        ArrayList list = new ArrayList();

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i<=10; i++){
            System.out.print("Enter "+i+" Student Name to store in list : ");
            String Student = scan.next();
            list.add(Student);
        }

        return list;
    }

    public static void main(String[] args) {
        Day1_Assignment2 obj = new Day1_Assignment2();
        ArrayList list = obj.Student();


        for (int i=0; i< list.size(); i++){
            System.out.println("Printing list using for loop at index "+i+" the value is "+list.get(i));
        }

        System.out.println("------------------------------------------------------------------------------------------");
        int j = 0;
        while (j<list.size()){
            System.out.println("Printing list using while loop at index "+j+" the value is "+list.get(j));
            j++;
        }

        System.out.println("------------------------------------------------------------------------------------------");
        int k = 0;
        do {
            System.out.println("Printing list using do while loop at index "+k+" the value is "+list.get(k));
            k++;
        }while (k< list.size());

        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println("Printing Element After removing element at index 4 by using For, While and do while.");
        list.remove(4);
        for (int a=0; a< list.size(); a++){
            System.out.println("Printing list using for loop at index "+a+" the value is "+list.get(a));
        }

        System.out.println("------------------------------------------------------------------------------------------");
        int b = 0;
        while (b<list.size()){
            System.out.println("Printing list using while loop at index "+b+" the value is "+list.get(b));
            b++;
        }

        System.out.println("------------------------------------------------------------------------------------------");
        int c = 0;
        do {
            System.out.println("Printing list using do while loop at index "+c+" the value is "+list.get(c));
            c++;
        }while (c< list.size());

    }
}
