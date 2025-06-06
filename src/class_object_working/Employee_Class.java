package class_object_working;

public class Employee_Class {

    String name="Rahul";
    int empID=12;
    String depart="Operations";

    public static void main(String[] args) {



        Employee_Class obj1= new Employee_Class();
        Employee_Class obj2= new Employee_Class();
        Employee_Class obj3= new Employee_Class();
        Employee_Class obj4= new Employee_Class();
        Employee_Class obj5= new Employee_Class();


        System.out.println("Name : "+obj1.name +" ; Emp ID : "+obj1.empID+" ; Depart : "+obj1.depart );
        System.out.println("Name : "+obj2.name +" ; Emp ID : "+obj2.empID+" ; Depart : "+obj2.depart );
        System.out.println("Name : "+obj3.name +" ; Emp ID : "+obj3.empID+" ; Depart : "+obj3.depart );
        System.out.println("Name : "+obj4.name +" ; Emp ID : "+obj3.empID+" ; Depart : "+obj4.depart );
        System.out.println("Name : "+obj5.name +" ; Emp ID : "+obj3.empID+" ; Depart : "+obj5.depart );
    }

}
