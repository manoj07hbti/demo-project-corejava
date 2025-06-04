package class_and_objects.param_constructor;

public class Student {

    String name;
    int age;
    int rollNo;
    String section;

    // param constructor
    public Student(String name, int age, int rollNo, String section) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.section = section;
    }

    public static void main(String[] args) {

        Student student1= new Student("Raj",21,01,"CS");
        System.out.println(student1.name + student1.age + student1.rollNo+student1.section);
        Student student2= new Student("Mukehs",20,02,"IT");
        System.out.println(student2.name + student2.age + student2.rollNo+student2.section);
    }
}
