package conditional_statement_if_else_nestedif;

public class NestedIf {

    public static void main(String[] args) {

       //write a code which can find even and odd numbers which is greater than 0.
        int number=14;

        if (number>0) {
            if (number%2 == 0) {
                System.out.println("Given number is even number..." + number);
            } else {
                System.out.println("Given number is odd number..." + number);
            }
        }else{
            System.out.println("Number is Greater than Zero...");
        }


    }
}
