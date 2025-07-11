package collections;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class DoctorList
{
    public Doctor createDoctor()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter doctor's name:");
        String name = scanner.nextLine();
        System.out.println("Enter doctor's age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter doctor's specialization:");
        String specialization = scanner.nextLine();

        Doctor doctor = new Doctor(name, age, specialization);

        return doctor;
    }

    public static void main(String[] args)
    {
        ArrayList <Doctor> doctorArrayList = new ArrayList<>();
        DoctorList doctorList = new DoctorList();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag)
        {
            Doctor doctorObj = doctorList.createDoctor();
            doctorArrayList.add(doctorObj);
            System.out.println("Press 'Y' to continue or press any other key to exit:");
            String choice = scanner.nextLine();
            if (!(choice.equalsIgnoreCase("Y")))
            {
                flag = false;
            }
        }

        for (Doctor var: doctorArrayList)
        {
            System.out.println("Doctor's name: "+var.getName()+", Age: "+var.getAge()+", Specialization: "+var.getSpecialization());
        }
    }
}
