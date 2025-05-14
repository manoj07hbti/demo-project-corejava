package conditional_statement;

public class DemoNestedIf {

    public static void main(String[] args) {

        // Write a code check number is divisible by 5, if number is greater tha 20
        int number=25;


        if (number>20){
            if (number%5 ==0){
                System.out.println("Given number is divisible by 5..."+number);
            }
        }else{
            System.out.println("Because Given number is not greater tha 20.."+number);
        }
    }
}
