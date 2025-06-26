package methods.scanner;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        // Create a code which will take String input from User

        System.out.println("please enter your name : ");
        //classname obj=new classname();

        Scanner obj=new Scanner(System.in);

        String name=obj.nextLine(); // it reads String input and returns back value
        System.out.println("my name is : "+name);

        System.out.println("please enter your Age : ");

        int age=obj.nextInt();
        System.out.println("my age is : "+age);

        System.out.println("please enter your height : ");

        double HG=obj.nextDouble();
        System.out.println("my height : "+HG);

    }

}
