package ClassAndObject.Param;

public class Employee {
    String Name;
    int Age;
    String Designation;
    int Experience;

    public Employee(String name, int age, String designation, int experience) {
        Name = name;
        Age = age;
        Designation = designation;
        Experience = experience;
    }

    public static void main(String[] args) {
        Employee Emp1 = new Employee("Vivek", 23, "Mechanical Engineer", 5);
        Employee Emp2 = new Employee("Pankaj", 34, "Electrical Engineer", 6);
        Employee Emp3 = new Employee("Aman", 38, "Robotic Engineer", 9);
        Employee Emp4 = new Employee("Rahul", 43, "Chemical Engineer", 12);

        System.out.println(Emp1.Name+" is "+Emp1.Age+" years old and He is a "+Emp1.Designation+" with "+Emp1.Experience+" years experience.");
        System.out.println(Emp2.Name+" is "+Emp2.Age+" years old and He is a "+Emp2.Designation+" with "+Emp2.Experience+" years experience.");
        System.out.println(Emp3.Name+" is "+Emp3.Age+" years old and He is a "+Emp3.Designation+" with "+Emp3.Experience+" years experience.");
        System.out.println(Emp4.Name+" is "+Emp4.Age+" years old and He is a "+Emp4.Designation+" with "+Emp4.Experience+" years experience.");

    }

}
