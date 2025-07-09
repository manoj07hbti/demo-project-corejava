package collections;

import models.DoctorList;

import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {

    public DoctorList doctorList(){

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter doctor name");
        String name= scanner.nextLine();
        System.out.println("Please enter specialty");
        String Specialty= scanner.nextLine();
        System.out.println("Please enter experience");
        int experience= scanner.nextInt();
        System.out.println("Please enter fees");
        int fees= scanner.nextInt();

        DoctorList Doctor = new DoctorList(name,Specialty,experience,fees);

        return Doctor;
    }

    public static void main(String[] args) {

        ArrayList<DoctorList>DocList= new ArrayList<>();
        Scanner Scanner = new Scanner(System.in);
        Doctor obj= new Doctor();

        boolean flag= true;
        while (flag ==true){
            DoctorList Doctor=obj.doctorList();
            DocList.add(Doctor);
            System.out.println("Do you want to add more doctor if yes then press A otherwise press any key to exit ");
            String choice= Scanner.nextLine();
            if (!choice.equals("A")==true){
                flag=false;

            }
        }

        for (DoctorList list: DocList){
            System.out.println("name= "+ list.getName() +" Specialty= "+ list.getSpecialty() +" Experience= "+ list.getExperience() +" Fees= "+ list.getFees());
        }
    }
}
