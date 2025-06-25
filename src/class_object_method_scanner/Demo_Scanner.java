package class_object_method_scanner;

import java.util.Scanner;

public class Demo_Scanner {

    public String name(String name){

        return "";

    }
    public String  age(int age){
        return "";
    }

    public static void main(String[] args) {

        Demo_Scanner scan =new Demo_Scanner();

        //Create Scanner object
        Scanner obj =new Scanner(System.in);

        String name=obj.nextLine();
        System.out.println("You have entered name as.."+name);
        
    }
}
