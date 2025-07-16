package java_collections.list;

import java.util.Scanner;
import java.util.ArrayList;
import modal.Doctor;
import modal.Employee;
import modal.Student;

public class DoctorList {

    public Doctor createDoctor(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter name: ");
        String name=scanner.nextLine();
        System.out.println("Please enter experience: ");
        int exp= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter speciality : ");
        String speciality= scanner.nextLine();

        Doctor doctor= new Doctor(name,exp, speciality);

        return doctor;
    }

    public static void main(String[] args) {
        ArrayList <Doctor> doctorsList = new ArrayList<>();
        DoctorList obj = new DoctorList();
        Scanner scanner = new Scanner(System.in);
       boolean flag = true;
       while (flag==true){
           Doctor doctorobj = obj.createDoctor();
           doctorsList.add(doctorobj);
           System.out.println("Do you want to add more Doctors ? press y to continue or any other key to exit...");
           String choice=scanner.nextLine();
           if(!(choice.equals("y"))){
               flag=false;
           }
       }
        for (Doctor var: doctorsList){
            System.out.println("Name: "+var.getName() + " Age: "+var.getExp()+" EmpId "+var.getSpeciality());
        }
        for (int i=0; i<doctorsList.size(); i++){
            Doctor s = doctorsList.get(i);
            System.out.println(s.getName() + " " + s.getExp() + " " + s.getSpeciality());

        }
    }

    }
