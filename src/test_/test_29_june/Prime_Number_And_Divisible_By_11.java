package test_.test_29_june;

public class Prime_Number_And_Divisible_By_11 {

    //write a code to check any number between 8 to 160 is divisible by 11, it should not be odd number

    public static void main(String[] args) {

        System.out.println("***************** any number between 8 to 190 is divisible by 11 and not odd **************");

        for (int i=8;i<=190;i++){
            if (i % 11==0 && i % 2==0){
                System.out.print(i + ", ");
            }
        }
/// //////////
        System.out.println("\n");   // for next line
        System.out.println("***************** Prime number between 1 to 10 **************");

        for (int i=1;i<=10;i++){
            boolean isPrime=true;

            for (int j=2;j<i;j++){
                if (i%j ==0) {
                    isPrime = false;
                }else{

                }
            }
            if (isPrime){
                System.out.print(i+", ");
            }else{

            }
        }

    }

}
