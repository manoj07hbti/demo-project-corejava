package test_26_05;

public class test_6 {
    public static void main(String[] args) {
        int n = 4;
        int factorial = 1;
        for(int i=n; i>=1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);


    }
}
