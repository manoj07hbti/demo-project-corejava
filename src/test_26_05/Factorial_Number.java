package test_26_05;

public class Factorial_Number {
    public static void main(String[] args) {
        //Q6-write a code to make factorial of number example factorial of 4 will be 4*3*2*1=24
        int num=8;
        int factorial=1;
        for (int i=8;i>0;i--){
            factorial *=i;
            System.out.print(i);
            if (i<=num){
                System.out.print(" x ");
            }
        }
        System.out.println(" = "+factorial);

    }
}
