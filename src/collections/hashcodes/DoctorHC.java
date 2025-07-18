package collections.hashcodes;

import model.Doctor;

import java.util.HashSet;

public class DoctorHC
{
    public void createDoctors()
    {
        HashSet <Doctor> doctorHashSet = new HashSet<>();

        Doctor doctorOne = new Doctor("Stalin",55,"Dentist");
        System.out.println("Doctor One HashCode: "+doctorOne.hashCode());
        Doctor doctorTwo = new Doctor("George",56,"Surgeon");
        System.out.println("Doctor Two HashCode: "+doctorTwo.hashCode());
        Doctor doctorThree = new Doctor("Alfred",65,"Neurosurgeon");
        System.out.println("Doctor Three HashCode: "+doctorThree.hashCode());
        Doctor doctorFour = new Doctor("Stalin",55,"Dentist");
        System.out.println("Doctor Four HashCode: "+doctorFour.hashCode());
        Doctor doctorFive = new Doctor("George",56,"Surgeon");
        System.out.println("Doctor Five HashCode: "+doctorFive.hashCode());

        doctorHashSet.add(doctorOne);
        doctorHashSet.add(doctorTwo);
        doctorHashSet.add(doctorThree);
        doctorHashSet.add(doctorFour);
        doctorHashSet.add(doctorFive);

        for (Doctor var: doctorHashSet)
        {
            System.out.println("Name: "+var.getName()+", Age:"+var.getAge()+", Specialization: "+var.getSpecialization());
        }
    }

    public static void main(String[] args)
    {
        DoctorHC doctorHC = new DoctorHC();
        doctorHC.createDoctors();
    }
}
