package methods.scanner;

import java.util.Scanner;

public class Calculator {

    public int add(int a, int b) {
        return (a + b);
    }
    public int subtraction( int a, int b ){
        return( a-b );
    }
    public int multiply ( int a, int b ){
        return( a*b);
    }
    public double divide ( int a , int b ){
        return( a/b );
    }
    public double percentage ( int a , int  b){
        return( a*b/100);
    }

    public static void main(String[] args) {
        String flag= "c";
        Scanner obj = new Scanner(System.in);
        while ( flag.equals("c") ){

            System.out.println("For percentage a= represent the number and " + "b represent the percentage you want");
            System.out.println(" please enter value of a: ");
            int a= obj.nextInt();
            System.out.println("please enter value of b: ");
            int b=obj.nextInt();
            System.out.println("please enter your choice , 1-Add , 2-Subtract , 3-divide ," +
                    "4-multiply ,5-percentage");

            int choice= obj.nextInt();

            Calculator cal =  new Calculator();
            if(choice== 1){
                System.out.println("Addition of given number is: " +cal.add(a,b));
            }
            if(choice==2){
                System.out.println("subtraction of given number is: " + cal.subtraction(a,b));
            }
            if(choice==3){
                System.out.println("Division of given number  is: " +cal.divide(a,b));
            }
            if(choice==4){
                System.out.println("multiplication of given number is: " +cal.multiply(a,b));
            }
            if(choice==5){
                System.out.println(" percentage of given number is: " +cal.percentage(a,b));
            }

            Scanner obj1 = new Scanner(System.in);
            System.out.println("press c to continue use and e to exit ");
            flag=obj1.nextLine();
            if (!flag.equals("c")){
                break;
            }
        }
    }
}