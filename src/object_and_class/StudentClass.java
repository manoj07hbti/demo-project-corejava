package object_and_class;

public class StudentClass {

    String name;
    int age;


    public StudentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        StudentClass obj1= new StudentClass("Tarun",21);
        System.out.println("name= "+obj1.name+ "  age= "+obj1.age);
    }
}
