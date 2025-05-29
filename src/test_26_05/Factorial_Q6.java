package test_26_05;

public class Factorial_Q6 {
    public static void main(String[] args) {

        //Q6-write a code to make factorial of number example factorial of 4 will be 4*3*2*1=24

          int number = 9 ;
        int factorial = 1 ;
        for( int i=number ; i>0; i-- ){
            factorial*=i ;
        } System.out.println("factorial of " +number + " is: " +factorial);


         number = 12 ;
         factorial = 1 ;
        for (int i = 1; i <= number; i++) {
            factorial*= i;
        } System.out.println("factorial of " + number + " is: " + factorial);

         number = 6 ;
         factorial = 1 ;
        int i=number ;
        while( i>0 ){
            factorial*=i ;
            i--;
        }  System.out.println("factorial of " + number + " is: " + factorial );
    }
 }
