package IfElse_statement_assign;

public class divisible_number {

    //write a code to check any number which is  greater than 0  and divisible by 5 .

    public static void main(String[] args) {
        int number = -85;
        if(number > 0) {
            if(number%5==0){
                System.out.println("number is divisible by 5... "+number);
            }else{
                System.out.println("not divisible by 5 ...."+number);
            }
        }else{
            System.out.println("not grater than zero ...." +number);
        }


    }
}