package obj_and_clss_param_constructor;

public class EmployeeClass {

    String office= "Deloitte";
    String name= "varun";
    int age= 22;
    String  employeeId= "Bl3178";
    int timing= 10;

    // param constructor

    public EmployeeClass(String office, String name, int age, String employeeId, int timing) {
        this.office = office;
        this.name = name;
        this.age = age;
        this.employeeId = employeeId;
        this.timing = timing;
    }

    public static void main(String[] args) {
        EmployeeClass obj1= new EmployeeClass("Deloitte","varun",22,"Bl3178",10);

        System.out.println("office Name= "+obj1.office+" EmployeeName= "+obj1.name+" Age= "+obj1.age+" EmployeeID= "+obj1.employeeId+" Officetiming= "+obj1.timing+"AM");
    }
}
