package class_and_objects.param_constructor;

public class Engineer {

    String name;
    String department;
    int age;

    public Engineer(String name, String department,int age){
        this.name=name;
        this.department=department;
        this.age=age;

    }

    public static void main(String[] args) {
        Engineer engineer1 = new Engineer("Er.Jagdish hans","civil engineer",46);
        Engineer engineer2 = new Engineer("Er.Sunil hans","civil engineer",33);
        Engineer engineer3 = new Engineer("Er.Sahil hans","civil engineer",33);
        Engineer engineer4 = new Engineer("Er.Jyoti hans","electrical engineer",28);
        Engineer engineer5 = new Engineer("Er.Nittin hans","civil engineer",25);
        System.out.println("information about engineers: " + " name: " +engineer1.name + " department: "
                + engineer1.department + " age: " +engineer1.age);
        System.out.println("information about engineers: " + " name: " +engineer2.name + " department: "
                + engineer2.department + " age: " +engineer2.age);
        System.out.println("information about engineers: " + " name: " +engineer3.name + " department: "
                + engineer3.department + " age: " +engineer3.age);
        System.out.println("information about engineers: " + " name: " +engineer4.name + " department: "
                + engineer4.department + " age: " +engineer4.age);
        System.out.println("information about engineers: " + " name: " +engineer5.name + " department: "
                + engineer5.department + " age: " +engineer5.age);
    }


}
