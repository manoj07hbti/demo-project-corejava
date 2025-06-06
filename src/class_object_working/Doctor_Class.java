package class_object_working;

public class Doctor_Class {

    // properties

    String name ="Amit Arora";
    String specialization ="Orthopedic";
    int yearsOfExperience=10;
    String hospital="AIIMS";

    public static void main(String[] args) {

        Doctor_Class obj1= new Doctor_Class();
        Doctor_Class obj2= new Doctor_Class();
        Doctor_Class obj3= new Doctor_Class();
        Doctor_Class obj4= new Doctor_Class();
        Doctor_Class obj5= new Doctor_Class();

        //To Print All Objects

        System.out.println("Name : "+obj1.name);
        System.out.println("Name : "+obj1.hospital);
        System.out.println("Name : "+obj1.specialization);
        System.out.println("Name : "+obj1.yearsOfExperience);
        System.out.println("                                       ");
        System.out.println("============================================");
        System.out.println("============================================");

        System.out.println("Name : "+obj2.name+" ; Hospital : "+obj2.hospital+" ; Specilist : "+obj2.specialization+" ; Experience : "+obj2.yearsOfExperience);
        System.out.println("Name : "+obj3.name+" ; Hospital : "+obj3.hospital+" ; Specilist : "+obj3.specialization+" ; Experience : "+obj3.yearsOfExperience);
        System.out.println("Name : "+obj4.name+" ; Hospital : "+obj4.hospital+" ; Specilist : "+obj4.specialization+" ; Experience : "+obj4.yearsOfExperience);
        System.out.println("Name : "+obj5.name+" ; Hospital : "+obj5.hospital+" ; Specilist : "+obj5.specialization+" ; Experience : "+obj5.yearsOfExperience);

    }

}
