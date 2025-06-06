package obj_and_clss_param_constructor;

public class DoctorClass {

    String doctorName= "Dr rohit";
    String department= "gynecologist";
    String city= "delhi";
    String expertise= "surgeries,cancer,infection";

    // param constructor


    public DoctorClass(String doctorName, String department, String city, String expertise) {
        this.doctorName = doctorName;
        this.department = department;
        this.city = city;
        this.expertise = expertise;
    }

    public static void main(String[] args) {

        DoctorClass obj1= new DoctorClass("Dr rohit","gynecologist","delhi","surgeries,cancer,infection");

        System.out.println("doctorName= "+obj1.doctorName+" department= "+obj1.department+" city= "+obj1.city+" expertise= "+obj1.expertise);
    }
}
