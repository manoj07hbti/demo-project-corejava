package test_.test_29_june;

public class Divisible_By_11 {

    //write a code to check any number between 8 to 160 is divisible by 11, it should not be odd number

    public void printDivisibleBy11(){
        System.out.println("***************** any number between 8 to 190 is divisible by 11 and not odd **************");

        for (int i=8;i<=190;i++){
            if (i % 11==0 && i % 2==0){
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
         Divisible_By_11 obj = new Divisible_By_11();
         obj.printDivisibleBy11();

    }

}
