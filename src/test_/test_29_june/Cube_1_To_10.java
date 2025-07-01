package test_.test_29_june;

import java.time.temporal.ChronoUnit;

public class Cube_1_To_10 {

    // Method : Print cubes of numbers from 1 to 10
    public String printCubesFrom1To10() {
        System.out.println("***************** Cube of numbers between 1 to 10 **************");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i * i + ", ");
        }
        return "";
    }

    public static void main(String[] args) {
        Cube_1_To_10 obj = new Cube_1_To_10();
        obj.printCubesFrom1To10();
    }
}
