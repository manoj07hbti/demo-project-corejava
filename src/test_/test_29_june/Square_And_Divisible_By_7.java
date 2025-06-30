package test_.test_29_june;

public class Square_And_Divisible_By_7 {

    //write a code to check any  number between 7 to 190 is divisible by 7, and it should not be odd number

    public static void main(String[] args) {

        System.out.println("***************** any number between 7 to 190 is divisible by 7 and not odd **************");

        for (int i=7;i<=190;i++){
            if (i % 7==0 && i % 2==0){
                System.out.print(i + ", ");
            }
        }
        /// /////////

        System.out.println("\n");   // for next line
        System.out.println("***************** square of number between 1 to 10 **************");

        for (int i=1;i<=10;i++){
            System.out.print(i*i+", ");
        }
    }
}
