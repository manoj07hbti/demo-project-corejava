package conditional_statement_if_else_nestedif;

public class EligibilityForDrivingLicence {

    public static void main(String[] args) {

        int age=17;

//person is eligible for driving licence based on condition of age(Age>18).

        if (age > 18){
            System.out.println("The Person is eligible for driving licence..: "+age);
        }

//person is eligible for driving licence based on condition of age(Age<18).

        if (age < 18){
            System.out.println("The Person is not eligible for driving licence..: "+age);
        }

    }
}
