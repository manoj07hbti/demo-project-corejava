package Hashmap;

import models.DoctorList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Doctor {

    public HashMap<String, HashSet<DoctorList>> doctor() {

        boolean flag = true;
        Scanner scanner = new Scanner(System.in);

        HashSet<DoctorList> aiimsDoctorList1 = new HashSet<>();
        HashSet<DoctorList> aiimsDoctorList2 = new HashSet<>();

        while (flag) {

            System.out.println("Enter  aiimsDoctorList1 Details ( name, Specialty, Experience, Fees):");
            System.out.println("Enter Doctor Name:");
            String name = scanner.nextLine();
            System.out.println("Enter Specialty");
            String specialty = scanner.nextLine();
            System.out.println("Enter Doctor Experience");
            int experience = scanner.nextInt();
            System.out.println("Enter Doctor Fees");
            int fees = scanner.nextInt();
            scanner.nextLine();

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Do You Want To Add More doctorNames Press 1 to Continue, Any Other Key to Exit ");
            String input = scanner1.nextLine();
            if (!input.equals("1")) {
                flag = false;
                aiimsDoctorList1.add(new DoctorList(name, specialty, experience, fees));
            }

            flag = true;
            while (flag) {

                System.out.println("Enter  aiimsDoctorList2 Details ( name, Specialty, Experience, Fees):");
                System.out.println("Enter Doctor Name:");
                String Name = scanner.nextLine();
                System.out.println("Enter Specialty");
                String Specialty = scanner.nextLine();
                System.out.println("Enter Doctor Experience");
                int Experience = scanner.nextInt();
                System.out.println("Enter Doctor Fees");
                int Fees = scanner.nextInt();
                scanner.nextLine();

                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Do You Want To Add More doctorNames Press 1 to Continue, Any Other Key to Exit ");
                String Input = scanner2.nextLine();
                if (!Input.equals("1")) {
                    flag = false;

                    aiimsDoctorList2.add(new DoctorList(Name, Specialty, Experience, Fees));

                }
            }

        }

        HashMap<String, HashSet<DoctorList>> doctorData = new HashMap<>();
        doctorData.put("1", aiimsDoctorList1);
        doctorData.put("2", aiimsDoctorList2);

        return doctorData;
    }

    public static void main(String[] args) {

        Doctor obj=new Doctor();
         HashMap<String ,HashSet<DoctorList>>doctorDataList = obj.doctor();

         for (String key :doctorDataList.keySet()){
             for (DoctorList var: doctorDataList.get(key)){

                 System.out.println("name= "+ var.getName()+ " Specialty= "+ var.getSpecialty() + " Experience= "+var.getExperience() + " Fees= "+ var.getFees());
             }
         }
    }


}
