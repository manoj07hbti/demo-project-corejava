package test_.test_29_june;

public class Divisible_By_7 {

    //write a code to check any  number between 7 to 190 is divisible by 7, and it should not be odd number

    public void printDivisibleBy7() {
        System.out.println("***************** Numbers between 7 to 190 divisible by 7 and not odd **************");

        for (int i = 7; i <= 190; i++) {
            if (i % 7 == 0 && i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }




    public static void main(String[] args) {
        Divisible_By_7 object = new Divisible_By_7();
        object.printDivisibleBy7();


    }
}
