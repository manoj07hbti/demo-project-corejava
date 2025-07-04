package java_collections;

import java.util.Scanner;

public class NameListLoops {

    public String names(){
        return names();
    }

        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            for (int i=1;i<=10;i++ )
            System.out.println("printing names :");

            String username=obj.nextLine();
            System.out.println("name :"+username);



        }
}
