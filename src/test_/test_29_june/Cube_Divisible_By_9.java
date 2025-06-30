package test_.test_29_june;

public class Cube_Divisible_By_9 {

    //write a code to check any number between 3 to 160 is divisible by 9, and it should not be odd number

    public static void main(String[] args) {

        System.out.println("***************** any number between 3 to 160 is divisible by 9  and not odd **************");

        for (int i=3;i<=160;i++){
            if (i % 9==0 && i % 2==0){
                System.out.print(i + ", ");
            }
        }
/// //////
        //write a code to print cube of number starting from 1 to 10
        //like 1, 8 , 27, 64 ....1000

        System.out.println("\n");   // for next line
        System.out.println("***************** Cube of number between 1 to 10 **************");

        for (int i=1;i<=10;i++){
            System.out.print(i*i*i+", ");
            }
    }
}


