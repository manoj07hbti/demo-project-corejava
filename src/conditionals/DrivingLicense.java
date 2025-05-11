package conditionals;

public class DrivingLicense {
    public static void main(String[] args) {

//wrtie a code to check whether person is elligible for driving licence
// based on condition of age, age should greater than 18.

        int age = 17;
        if (age>19) {
            System.out.println("this person is elligibile for driving license person age is =" + age);
        }

        // this person is not eligible for driving license based on condition of age

        if (age < 18) {
            System.out.println("this person is not elligibile for driving license because person age is = " + age);

        }
    }
}

