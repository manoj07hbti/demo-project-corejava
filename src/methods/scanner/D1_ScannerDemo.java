package methods.scanner;

import java.util.Scanner;

public class D1_ScannerDemo {
    public static void main(String[] args) {

        // Create a code which will take String input from User
        System.out.println(" please enter your name: ");
        //ClassName objName = new ClassName();
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine(); //it reads String input and return back value
        System.out.println("The name you entered is..." + name);

        System.out.println(" please enter your age: ");
        int age= obj.nextInt(); //it reads int input and return back value
        System.out.println("Age you entered is..." + age);

        System.out.println("please enter your height");
        double height = obj.nextDouble(); //it reads double input and return back value
        System.out.println("Height you entered is..." +height);

    }
}
