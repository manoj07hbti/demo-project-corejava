package class_and_object;

public class Employee
{
    String name = "Rosenberg";
    String wing = "D";
    int salary = 50000;
    int deskNumber = 6;
    double promotionPoints = 55.6;

    public static void main(String[] args)
    {
        Employee employee = new Employee();

        System.out.println("Name: "+employee.name);
        System.out.println("Salary: "+employee.salary);
        System.out.println("Desk Number: "+employee.deskNumber);
        System.out.println("Wing: "+employee.wing);
        System.out.println("Promotion Points: "+employee.promotionPoints);
    }
}
