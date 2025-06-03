package class_object;

public class Doctor {
    String name = "talim";
    int age = 31;
    String qualification = "M.B.B.S.";
    String hospital = "IGMC";
    String duty = "HDU";

    public static void main(String[] args) {
        Doctor obj1 = new Doctor();

        System.out.println("Doctr's Name = "+obj1.name +" Age = "+obj1.age +" qualification = "+obj1.qualification +" Hospital = "+obj1.hospital +"Duty ward = "+obj1.duty);
    }


}
