package class_and_objects;

public class Employee {

    // Properties of the data member
    String name="amit";
    int age =31;
    String address="jammu";
    long contactnumber= 9797546233L;
    int monthlysalary=35000;

    public static void main(String[] args) {

       Employee obj1= new Employee();

        System.out.println("name :"+obj1.name +","+ "age :"+obj1.age +","+ "address :"+ obj1.address +","+ "contactnumber :"+ obj1.contactnumber +","+ "salary: "+obj1.monthlysalary);
    }

}
