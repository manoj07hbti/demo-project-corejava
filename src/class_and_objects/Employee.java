package class_and_objects;

public class Employee {

//Properties

    String name = " Ashish " ;
    String department = " finance " ;
    String designation = " accountant " ;
    int salary = 45000;

    public static void main(String[] args) {

        // Syntax:- ClassName objName= new ClassName();

        Employee obj1 = new Employee();
        Employee obj2 = new Employee();
        Employee obj3 = new Employee();
        Employee obj4 = new Employee();
        Employee obj5 = new Employee();

        //object.propertyName;
        System.out.println( obj1.name);
        System.out.println( obj1.department);
        System.out.println( obj1.designation);
        System.out.println( obj1.salary);

        System.out.println( " Information of employer is: " + "name-"  +obj1.name + "department-" + obj1.department + "designation-" +obj1.designation +"salary-" + obj1.salary);


    }
}
