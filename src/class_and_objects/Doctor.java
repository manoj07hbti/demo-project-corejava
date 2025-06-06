package class_and_objects;

public class Doctor {

    String name = " Dr. sayed nazim hussain ";
    String  speciality = " Dermatology ";
    int yearOfExperience = 12;

    public static void main(String[] args) {

        Doctor obj1 = new Doctor();
        Doctor obj2 = new Doctor();
        Doctor obj3 = new Doctor();
        Doctor obj4 = new Doctor();
        Doctor obj5 = new Doctor();

        System.out.println("Information about doctor: " + "name-" + obj1.name + "speciality-" +
                obj1.speciality + " yearOfExperience- " + obj1.yearOfExperience );


    }
}
