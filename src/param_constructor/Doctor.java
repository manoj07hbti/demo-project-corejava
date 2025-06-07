package param_constructor;

public class Doctor
{
    String name;
    String degree;
    int salary;

    public Doctor(String name, String degree, int salary)
    {
        this.name = name;
        this.degree = degree;
        this.salary = salary;
    }

    public static void main(String[] args)
    {
        Doctor doctorOne = new Doctor("Stalin","M.B.B.S",900000);
        System.out.println("Doctor's Name: "+doctorOne.name+", Degree: "+doctorOne.degree+", Salary: "+doctorOne.salary);
        Doctor doctorTwo = new Doctor("Thomas","B.D.S",450000);
        System.out.println("Doctor's Name: "+doctorTwo.name+", Degree: "+doctorTwo.degree+", Salary: "+doctorTwo.salary);
        Doctor doctorThree = new Doctor("Frank","B.H.M.S",420000);
        System.out.println("Doctor's Name: "+doctorThree.name+", Degree: "+doctorThree.degree+", Salary: "+doctorThree.salary);
    }
}
