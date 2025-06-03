package object_and_class;

public class DoctorClass {

    String hospitalName= "AIIMS";
    String address= "Near AIIMS metro Station";
    String doctorName= "Dr Tarun";
    String Department= "Cardiologist";
    String floor= "Ground floor";
    String PatienceFloor= "2nd Floor";
    int patienceRoomNumber= 21;
    String patienceName= "Mayank";

    public static void main(String[] args) {

        DoctorClass obj1= new DoctorClass();

        System.out.println("Details of hospital and doctor:-");
        System.out.println("hospitalName= "+obj1.hospitalName);
        System.out.println("address= "+obj1.address);
        System.out.println("doctorName= "+obj1.doctorName);
        System.out.println("doctorDepartment= "+obj1.Department);
        System.out.println("Floor= "+obj1.floor);
        System.out.println();
        System.out.println("Details of patience:- ");
        System.out.println("patienceName= "+obj1.patienceName);
        System.out.println("patienceRoomNumber= "+obj1.patienceRoomNumber);
        System.out.println("Floor= "+obj1.PatienceFloor);






    }





}
