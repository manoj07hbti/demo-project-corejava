package conditional_statements;

public class nestedIf {

    public static void main(String[] args) {

        //if and else
        //	if(marks >= 60)  first division 	else   not first division
        //	 if(marks< 33) : not cleared exam  else: cleared exam

        int marks=54;
        if (marks>=60){
            System.out.println("first division ");
        }else System.out.println("not first division");
        if (marks<33){
            System.out.println("not cleared exam");
        }else {
            System.out.println("cleared exam");
        }
        //write a code to check any number which is  greater than 0  and divisible by 5.

        int number=30;
        if (number>0){
            System.out.println("number is greater than zero..");
            if (number%5==0){
                System.out.println("number is divisible by 5...");
            }
        }
        //1. write a code which can find even and odd numbers which is greater than 0.

        number=21;
        if (number>0){

            if (number%2==0){
                System.out.println("given number is even :"+number);
            }if (number%2==1){
                System.out.println("given number is odd :"+number);
            }
        }


        number=9;


            if (number%3==1) {
                System.out.println("this number is not divisible by 3");
                if (number % 3 == 2) {
                    System.out.println("this number is not divisible by 3");
                }

            }




    }
}
