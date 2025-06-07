package class_and_objects;

public class Student {

    String name;
    int age;
    String section;

  //functionalities
  //study

    public void studyMethod(){

        System.out.println("Printing study method");
    }
  //run
  //eat



    public static void main(String[] args) {

        Student obj1= new Student();// default constructor
        System.out.println(obj1.name+ " Age "+obj1.age+" Section "+obj1.section);

    }
}
