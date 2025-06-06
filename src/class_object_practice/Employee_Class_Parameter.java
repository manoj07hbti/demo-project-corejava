package class_object_practice;

import javax.sound.midi.Soundbank;

public class Employee_Class_Parameter {

    String name;
    String specialization;
    int experience;
    double salary;

    public Employee_Class_Parameter(String name, String specialization, int experience, double salary) {
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Employee_Class_Parameter employee1= new Employee_Class_Parameter("Neeshu","MIS Executive",10,80000);
        Employee_Class_Parameter employee2= new Employee_Class_Parameter("Sarvesh","Electrical Engineer",8,76890);
        Employee_Class_Parameter employee3= new Employee_Class_Parameter("Suraj","Technical",4,60000);

        System.out.println("Name : "+employee1.name+" ; Department : "+employee1.specialization+" ; Package :"+employee1.salary+" ; Experience : "+employee1.experience);
        System.out.println("=============================================================================");

        System.out.println("Name : "+employee2.name+" ; Department : "+employee2.specialization+" ; Package :"+employee2.salary+" ; Experience : "+employee2.experience);
        System.out.println("=============================================================================");

        System.out.println("Name : "+employee3.name+" ; Department : "+employee3.specialization+" ; Package :"+employee3.salary+" ; Experience : "+employee3.experience);

    }
}
