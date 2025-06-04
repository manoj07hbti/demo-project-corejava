package class_and_object;

public class Doctor
{
    String name = "Stalin";
    String career = "Surgeon";
    String qualification = "M.B.B.S";
    int salary = 7000000;
    int cabinNumber = 4;

    public static void main(String[] args)
    {
        Doctor doctor = new Doctor();

        System.out.println("Name: "+doctor.name);
        System.out.println("Career: "+doctor.career);
        System.out.println("Qualification: "+doctor.qualification);
        System.out.println("Salary: "+doctor.salary);
        System.out.println("Cabin Number: "+doctor.cabinNumber);
    }
}
