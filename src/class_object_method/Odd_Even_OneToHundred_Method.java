package class_object_method;

public class Odd_Even_OneToHundred_Method {


    //write a code to find even and odd number between 1 to 100
    public void oddOneToHundred() {

        // using for Loop
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Number B/w 1 to 100 : " + i);
            }
        }
        System.out.println("==============================================");

    }


    // For Even Number
    public void evenOneToHundred() {
        // using for Loop
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Number B/w 1 to 100 : " + i);
            }
        }
    }


    public static void main(String[] args) {

        // Create Object for Odd
        Odd_Even_OneToHundred_Method obj1 = new Odd_Even_OneToHundred_Method();
        obj1.oddOneToHundred();

        //Create Object for Even Number
        Odd_Even_OneToHundred_Method obj2=new Odd_Even_OneToHundred_Method();
        obj2.evenOneToHundred();

    }
}
