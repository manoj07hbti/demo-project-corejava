package class_object_practice;

public class Doc_Parameterized_Constructor {

    String name;
    String specialization;
    int yearOfExperience;
    String hospital;

    // Generate parameter Constructor


    public Doc_Parameterized_Constructor(String name, String specialization, int yearOfExperience, String hospital) {
        this.name = name;
        this.specialization = specialization;
        this.yearOfExperience = yearOfExperience;
        this.hospital = hospital;
    }

    public static void main(String[] args) {

        Doc_Parameterized_Constructor doctor1= new Doc_Parameterized_Constructor("Rahul Tripathi","Ortho",10,"AIIMS");
        Doc_Parameterized_Constructor doctor2= new Doc_Parameterized_Constructor("Abhishek Bhatia","Neurology",8,"MAX Hospital");
        Doc_Parameterized_Constructor doctor3= new Doc_Parameterized_Constructor("Kunal Sagar","Dermatologists",18,"Pushpanjali");


        System.out.println("Name : "+doctor1.name+" ; Specialization : "+doctor1.specialization+" ; Experience : "+doctor1.specialization+" ; Hospital : "+doctor1.hospital);
        System.out.println("=========================================");
        System.out.println("Name : "+doctor2.name+" ; Specialization : "+doctor2.specialization+" ; Experience : "+doctor2.specialization+" ; Hospital : "+doctor2.hospital);
        System.out.println("=========================================");
        System.out.println("Name : "+doctor3.name+" ; Specialization : "+doctor3.specialization+" ; Experience : "+doctor3.specialization+" ; Hospital : "+doctor3.hospital);
    }
}
