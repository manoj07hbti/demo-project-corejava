package obj_and_clss_param_constructor;

public class EngineerClass {

    String name= "tarun";
    String office= "Tech mahindra";
    int age= 28;
    String  employeeId= "C128P";
    int timing= 10;

    // param constructor

    public EngineerClass(String name, String office, int age, String employeeId, int timing) {
        this.name = name;
        this.office = office;
        this.age = age;
        this.employeeId = employeeId;
        this.timing = timing;

    }

    public static void main(String[] args) {
    EngineerClass obj1= new EngineerClass("tarun","tech mahindra",28,"C128P",10);

        System.out.println("name= "+obj1.name+" officeName= "+obj1.office+" age= "+obj1.age+" employeeID= "+obj1.employeeId+" timing= "+obj1.timing+"AM");

    }
}
