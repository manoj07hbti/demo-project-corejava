package class_object_practice;

public class Engineer_Class_Parameter {

    String name;
    String specialization;
    int experience;
    double salary;

    public Engineer_Class_Parameter(String name, String specialization, int experience, double salary) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Engineer_Class_Parameter engineer1= new Engineer_Class_Parameter("Neeshu","MIS Executive",10,80000);
        Engineer_Class_Parameter engineer2= new Engineer_Class_Parameter("Sarvesh","Electrical Engineer",8,76890);
        Engineer_Class_Parameter engineer3= new Engineer_Class_Parameter("Suraj","Technical",4,60000);
        Engineer_Class_Parameter engineer4= new Engineer_Class_Parameter("Khusboo","Japanese Enterperator",6,90000);


//        Employee_Class_Parameter employee= new Employee_Class_Parameter("Suraj","Technical",4,60000);

        System.out.println("Name : "+engineer1.name+" ; Department : "+engineer1.specialization+" ; Package :"+engineer1.salary+" ; Experience : "+engineer1.experience);
        System.out.println("=============================================================================");

        System.out.println("Name : "+engineer2.name+" ; Department : "+engineer2.specialization+" ; Package :"+engineer2.salary+" ; Experience : "+engineer2.experience);
        System.out.println("=============================================================================");

        System.out.println("Name : "+engineer3.name+" ; Department : "+engineer3.specialization+" ; Package :"+engineer3.salary+" ; Experience : "+engineer3.experience);
        System.out.println("=============================================================================");

        System.out.println("Name : "+engineer4.name+" ; Department : "+engineer4.specialization+" ; Package :"+engineer4.salary+" ; Experience : "+engineer4.experience);

    }
}
