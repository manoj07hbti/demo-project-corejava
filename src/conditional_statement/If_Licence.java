package conditional_statement;

public class If_Licence {
    public static void main(String[] args) {

        int age=20;
        if (age>=18){
            System.out.println("person is eligible for driving licence>=18: " +age);

            age=15;
            if (age<18){
                System.out.println("person is not eligible for driving licence<18: " +age);
            }
        }
    }
}
