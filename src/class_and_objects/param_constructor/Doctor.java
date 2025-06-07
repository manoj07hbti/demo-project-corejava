package class_and_objects.param_constructor;

public class Doctor {

    String name;
    String department;
    int yearOfExperience;

    public Doctor(String name, String department, int yearOfExperience){
        this.name=name;
        this.department=department;
        this.yearOfExperience=yearOfExperience;
    }

    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Dr.Ashish lohra","psychologist",8);
        Doctor doctor2 = new Doctor("Dr.Rohit agarwal","Orthopedics",5);
        Doctor doctor3 = new Doctor("Dr.Manmohan attri ","dermatologist",12);
        Doctor doctor4 = new Doctor("Dr.Sumit sharma","Radiologist",9);
        Doctor doctor5 = new Doctor("Dr.Ankush verma","ENT",6);
        System.out.println("Information about doctor: " + "name-" + doctor1.name + " department-" +
                doctor1.department + " yearOfExperience- " + doctor1.yearOfExperience );
        System.out.println("Information about doctor: " + "name-" + doctor2.name + " department-" +
                doctor2.department + " yearOfExperience- " + doctor2.yearOfExperience );
        System.out.println("Information about doctor: " + "name-" + doctor3.name + " department-" +
                doctor3.department + " yearOfExperience- " + doctor3.yearOfExperience );
        System.out.println("Information about doctor: " + "name-" + doctor4.name + " department-" +
                doctor4.department + " yearOfExperience- " + doctor4.yearOfExperience );
        System.out.println("Information about doctor: " + "name-" + doctor5.name + " department-" +
                doctor5.department + " yearOfExperience- " + doctor5.yearOfExperience );

    }
}
