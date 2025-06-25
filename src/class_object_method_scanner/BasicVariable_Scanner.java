package class_object_method_scanner;

import java.util.Scanner;

public class BasicVariable_Scanner {

    public String name(String name){

        return name;

    }
    public int age(int age){
        return age;
    }

    public double height(double height){
        return height;
    }

    public static void main(String[] args) {


        System.out.println("Please enter you name:");
        //syntax: ClassName objName = new ClassName();

        Scanner obj = new Scanner(System.in);

        BasicVariable_Scanner user = new BasicVariable_Scanner();


        String name = obj.nextLine();
        System.out.println("You hav entered name as : " + user.name(name) );

        System.out.println("Please enter you age: ");
        int age = obj.nextInt();
        System.out.println("You have entered age as : " + user.age(age) );

        System.out.println("Please enter your height");
        double heigh = obj.nextDouble();
        System.out.println("You have entered height as : " + user.height(heigh) );
    }
}
