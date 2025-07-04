package test_29_june;

public class CubePrinter {

    public int getCube(int num) {
     return num * num * num ;
    }

    public static void main(String[] args) {

        CubePrinter obj = new CubePrinter();

        System.out.println("Cube of numbers from 1 to 10:");
        for(int i = 1; i<=10; i++){
            int cube = obj.getCube(i);
            System.out.println("Square of " + i + " is: " + cube);
        }
    }
}
