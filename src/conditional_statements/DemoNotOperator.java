package conditional_statements;

public class DemoNotOperator {
    public static void main(String[] args) {

        //Assignment using ! operator:
        //Write a code to check Country should not be india

        String country="america";

        if (!(country=="india")){
            System.out.println("country is not india");
        }else {
            System.out.println("country is india");
        }

        //write a code to check number is divisible by 5


        int number=50;
        if (!(number%5==0)) {
            System.out.println("number is not divisible by 5");
        }else {
            System.out.println("number is divisible by 5");
        }

        //write a code to check number is even or odd.

        number=7;
        if (!(number%2==1)){
            System.out.println("number is even");
        }else {
            System.out.println("number is odd");
        }

        number=14;
        if (!(number%2==1)){
            System.out.println("number is even");
        }else {
            System.out.println("number is odd");
        }









    }






}
