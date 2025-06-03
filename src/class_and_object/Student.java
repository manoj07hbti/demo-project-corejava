package class_and_object;

public class Student {

    String name="Rahul";
    int age=23;
    String section="Science";


    public static void main(String[] args) {

        Student obj1= new Student();// default constructor
        System.out.println(obj1.name+ " Age "+obj1.age+" Section "+obj1.section);

    }

}
