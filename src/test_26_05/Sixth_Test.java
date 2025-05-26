package test_26_05;

public class Sixth_Test {
    public static void main(String[] args) {
        // Q6-write a code to make factorial of number example factorial of 4 will be 4*3*2*1=24
        int num = 5;
        int result = 1;
        for (int i = num; i>= 1; i--) {
            result = result * i;
        }
        System.out.println("Factorial of "+num+" is "+result+".");
    }
}
