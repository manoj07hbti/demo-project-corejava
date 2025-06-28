package methods.scanner;

import java.util.Scanner;

public class DemoScanner {



    public static void main(String[] args) {
        // Create a code which will take String input from User
        System.out.println("Please enter you name:");
        //ClassName objName = new ClassName();
        Scanner obj=new Scanner(System.in);
        String name= obj.nextLine(); // it reads String input and returns back value
        System.out.println("You hav entered name as : "+name);

        System.out.println("Please enter you age: ");
        int age= obj.nextInt(); // it reads int input from the keyboard and returns entered value to the program
        System.out.println("You have entered age as : "+age);

        System.out.println("Please enter your height");
        double height=obj.nextDouble();
        System.out.println("You have entered height as : "+height);

    }
}
