package hashcode;

import models.DoctorList;

import java.util.LinkedHashSet;

public class Doctor_Hashcode {


    public void Doctor_Data(){

        LinkedHashSet<DoctorList>DoctorHashcode= new LinkedHashSet<>();


        DoctorList s1= new DoctorList("Dr Rahul","Cardiologist",4,200);
        System.out.println("Hashcode of S1 is "+s1.hashCode());
        DoctorList s2= new DoctorList("Dr Krishna","Neurologist",6,250);
        System.out.println("Hashcode of S2 is "+s2.hashCode());
        DoctorList s3= new DoctorList("Dr Krishna","Neurologist",6,250);
        System.out.println("Hashcode of S3 is "+s3.hashCode());
        DoctorList s4= new DoctorList("Dr jai","Dermatologist",2,300);
        System.out.println("Hashcode of S4 is "+s4.hashCode());
        DoctorList s5= new DoctorList("Dr Rahul","Cardiologist",4,200);
        System.out.println("Hashcode of S5 is "+s5.hashCode());


        DoctorHashcode.add(s1);
        DoctorHashcode.add(s2);
        DoctorHashcode.add(s3);
        DoctorHashcode.add(s4);
        DoctorHashcode.add(s5);

        for (DoctorList List: DoctorHashcode){
            System.out.println("Name= " + List.getName() +" Specialty= "+ List.getSpecialty() + " Experience= "+ List.getExperience() + " Fees= "+List.getFees());
        }
    }

    public static void main(String[] args) {

        Doctor_Hashcode obj =new Doctor_Hashcode();
        obj.Doctor_Data();
    }
}
