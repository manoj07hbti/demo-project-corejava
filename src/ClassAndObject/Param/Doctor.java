package ClassAndObject.Param;

public class Doctor {
    String Name;
    int Age;
    String Department;

    public Doctor(String name, int age, String department) {
        Name = name;
        Age = age;
        Department = department;
    }

    public static void main(String[] args) {
        Doctor Doctor1 = new Doctor("Ramesh", 45, "Cardiologist");
        Doctor Doctor2 = new Doctor("Ram", 55, "Brian Surgeon");
        Doctor Doctor3 = new Doctor("Suresh", 37, "Pediatrics");
        Doctor Doctor4 = new Doctor("Anil", 56, "Neurology");
        Doctor Doctor5 = new Doctor("Rajesh", 65, "Dermatology");

        System.out.println(Doctor1.Name+" and its age is "+Doctor1.Age+". He is a "+Doctor1.Department);
        System.out.println(Doctor2.Name+" and its age is "+Doctor2.Age+". He is a "+Doctor2.Department);
        System.out.println(Doctor3.Name+" and its age is "+Doctor3.Age+". He is a "+Doctor3.Department);
        System.out.println(Doctor4.Name+" and its age is "+Doctor4.Age+". He is a "+Doctor4.Department);
        System.out.println(Doctor5.Name+" and its age is "+Doctor5.Age+". He is a "+Doctor5.Department);


    }
}
