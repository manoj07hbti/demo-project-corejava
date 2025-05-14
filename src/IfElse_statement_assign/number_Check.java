package IfElse_statement_assign;

public class number_Check {
    public static void main(String[] args){
        //write a code which can find even and odd numbers which is greater than 0
        int number = 27;
        if(number%2==0) {
            System.out.println("it is even... " + number);
            if(number%2!=0){
                System.out.println("it is odd... " +number);
            }
        }else{
            System.out.println("not greater than zero...." +number);
        }

    }
}
