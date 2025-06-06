package class_and_objects.param_constructor;

public class Employee {

    // Properties of the data member
    String name;
    int age;
    String address;
    long contactnumber;
    int monthlysalary;

    public Employee(String name, int age, String address, long contactnumber, int monthlysalary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactnumber = contactnumber;
        this.monthlysalary = monthlysalary;
    }

    public static void main(String[] args) {

        Employee obj1=new Employee("sumit",33,"delhi",9797673302L,32000);
        System.out.println("name :"+obj1.name +","+ "age :"+obj1.age +","+ "address :"+ obj1.address +","+ "contactnumber :"+ obj1.contactnumber +","+ "salary: "+obj1.monthlysalary);

        Employee proj2=new Employee("amit",41,"jammu",6005633761L,60000);
        System.out.println("name :"+proj2.name +","+ "age :"+proj2.age +","+ "address :"+ proj2.address +","+ "contactnumber :"+ proj2.contactnumber +","+ "salary: "+proj2.monthlysalary);

    }
}
