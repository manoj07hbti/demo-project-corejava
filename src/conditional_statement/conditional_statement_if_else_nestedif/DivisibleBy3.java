package conditional_statement.conditional_statement_if_else_nestedif;

public class DivisibleBy3 {

    public static void main(String[] args) {

        //Write a code to identify  number which is not divisible by 3.

        int number=0;

        if (number>0 || number<0) {
            if (number % 3 == 0) {
                System.out.println(number + " Divisible by 3..");
            } else {
                System.out.println(number + " not Divisible by 3..");
            }
        }else{
            System.out.println("The number is Zero");
        }

    }
}
