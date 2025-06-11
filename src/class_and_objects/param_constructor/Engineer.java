package class_and_objects.param_constructor;

public class Engineer {

    String name;
    int age;
    String branch;
    public Engineer (String name, int age, String branch){
        this.name=name;
        this.age=age;
        this.branch=branch;

    }

    public static void main(String[] args) {

        Engineer obj = new Engineer("Ravi", 44, "Mechanical");
        Engineer obj1 = new Engineer("Harish", 25, "Electrical");
        System.out.println(obj.name + " " + obj.age + " " + obj.branch);
        System.out.println(obj1.name + " "+ obj1.age +" "+ obj1.branch);
    }
}
