package object_and_class;

public class EmployeeClass {

    String name= "Tarun Sachdeva";
    int age= 21;
    String officeName= "collagevidhya";
    String address= "noida sector 16";
    double timing= 10;

    public static void main(String[] args) {

        EmployeeClass objt1= new EmployeeClass();
        //      System.out.print("name= "+objt1.name+" age= "+objt1.age+" officename= "+objt1.officename+" address= "+objt1.address+" timeing= "+objt1.timing);

        System.out.println("name= "+objt1.name);
        System.out.println("age= "+objt1.age);
        System.out.println("officename= "+objt1.officeName);
        System.out.println("address= "+objt1.address);
        System.out.println("timing= "+objt1.timing+" AM");


    }

}
