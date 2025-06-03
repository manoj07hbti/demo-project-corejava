package object_and_class;

public class EnginnerClass {

    String name= "Tarun";
    int age= 21;
    String officeNam= "TLC";
    String departmentName= "Software Enginner";
    String floor= "1st Floor";
    int timeing= 10;

    public static void main(String[] args) {

        EnginnerClass obj1= new EnginnerClass();

        System.out.println("officename= "+obj1.officeNam);
        System.out.println("Name= "+obj1.name);
        System.out.println("age= "+obj1.age);
        System.out.println("departmentName= "+obj1.departmentName);
        System.out.println("Floor= "+obj1.floor);
        System.out.println("timing= "+obj1.timeing+" AM");

    }

}
