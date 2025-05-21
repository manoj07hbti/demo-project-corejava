package test_18_may;

public class Not_Divisible_by_Three {
    //Write a code to identify  number which is not divisible by 3.

    public static void main(String[] args) {
        int Num = 6;
        if(Num%3 != 0){
            System.out.println(Num+" is not divisible by 3.");
        }
        else {
            System.out.println(Num+" is Divisible by 3.");
        }
    }
}
