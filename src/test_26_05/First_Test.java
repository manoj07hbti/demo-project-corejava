package test_26_05;

public class First_Test {
    public static void main(String[] args) {
        /*
        Q1-Write a program to print

            -3
            -2
            -1
            0
            1
            2
            3

         */
        int num = 3;
        for(int i = -(num); i<=num; i++){
            System.out.println(i);
        }
    }
}
