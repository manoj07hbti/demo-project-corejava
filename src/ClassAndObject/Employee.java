package ClassAndObject;

public class Employee {
    String name[] = {"Ram", "Shyam","Raju","Pankaj","Vipin"};
    String Designation[] = {"Software Developer","Java Developer","Python Developer",".Net Developer","Golang Developer"};
    int Experience[] = {10,12,8,5,9};

    public static void main(String[] args) {
        Employee Emp1 = new Employee();


        for (int i = 0; i<5; i++){
            System.out.println(Emp1.name[i]+" is a "+Emp1.Designation[i]+" and they have "+Emp1.Experience[i]+" years experience.");

        }
    }

}

