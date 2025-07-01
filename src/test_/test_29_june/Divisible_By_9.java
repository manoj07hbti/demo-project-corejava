package test_.test_29_june;

public class Divisible_By_9 {

    //write a code to check any number between 3 to 160 is divisible by 9, and it should not be odd number
    public String printDivisibleBy9AndEven() {
        System.out.println("***************** Numbers between 3 to 160 divisible by 9 and not odd **************");

        for (int i = 3; i <= 160; i++) {
            if (i % 9 == 0 && i % 2 == 0) {
                System.out.print (i + ", ");
            }
        }
        System.out.println("\n"); // For spacing
        return "";
    }




    public static void main(String[] args) {

        Divisible_By_9 object = new Divisible_By_9();
        object.printDivisibleBy9AndEven();



    }
}


