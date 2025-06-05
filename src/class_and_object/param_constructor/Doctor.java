package class_and_object.param_constructor;

public class Doctor {

    String name;
    String hospital;
    String specialist;
    int salary;


    public Doctor(String name, String hospital, String specialist, int salary) {
        this.name = name;
        this.hospital = hospital;
        this.specialist = specialist;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Doctor obj1= new Doctor("Santosh ","SKR ","DENTAL ",34800);

        System.out.println(obj1.name+obj1.hospital+obj1.specialist+obj1.salary);

        Doctor obj2= new Doctor("Vipin ","Dist.Reasi ","ortho ",39604);

        System.out.println(obj2.name+obj2.hospital+obj2.specialist+obj2.salary);

    }

}
