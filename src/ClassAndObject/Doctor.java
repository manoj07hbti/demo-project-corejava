package ClassAndObject;

public class Doctor {
    String Name = "Raju";
    int age = 40;
    String Department = "Dental Doctor";

    public static void main(String[] args) {
        Doctor Doc1 = new Doctor();
        Doctor Doc2 = new Doctor();
        Doctor Doc3 = new Doctor();
        Doctor Doc4 = new Doctor();
        Doctor Doc5 = new Doctor();

        System.out.println(Doc1.Name+" is a "+Doc1.Department+" And He is "+Doc1.age+" years old.");
        System.out.println(Doc2.Name+" is a "+Doc2.Department+" And He is "+Doc2.age+" years old.");
        System.out.println(Doc3.Name+" is a "+Doc3.Department+" And He is "+Doc3.age+" years old.");
        System.out.println(Doc4.Name+" is a "+Doc4.Department+" And He is "+Doc4.age+" years old.");
        System.out.println(Doc5.Name+" is a "+Doc5.Department+" And He is "+Doc5.age+" years old.");

    }
}
