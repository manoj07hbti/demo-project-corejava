package IfElse_statement_assign;

public class number_Check {
    public static void main(String[] args) {
        //write a code which can find even and odd numbers which is greater than 0
        int a = 3;
        if(a>0) {
            if (a % 2 == 0) {
                System.out.println("it is an even number ..." + a);
            }
        }if(a%2!=0) {
            System.out.println("it is an odd number..." + a);
        }
        if(a<0){
            System.out.println("not greater than zero... "+a);
        }
    }
}


