package class_and_object;

public class Doctor {

    String name="vishal";
    String hospital="SRK pathankot";
    String specialist="Orthopaedic";
    int salary =250000;

    public static void main(String[] args) {

        Doctor OBJ1= new Doctor();

        System.out.println("Name : "+OBJ1.name+", Hospital :"+OBJ1.hospital+", Specialist : "
        +OBJ1.specialist+", Salary : "+OBJ1.salary);


    }


}
