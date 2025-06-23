package methods;

public class Employee {

    String name;
    String company;
    String work;
    int salary;

    public void workmethod() {

        System.out.println("this is work method...");
    }

    public void eatmethod() {
        System.out.println("this is eat method...");
    }

    public void sleepmethod() {

        System.out.println("this i sleepmethod...");
    }

    public static void main(String[] args) {


        Employee obj2= new Employee();
        obj2.eatmethod();
        obj2.workmethod();
        obj2.sleepmethod();

    }

}