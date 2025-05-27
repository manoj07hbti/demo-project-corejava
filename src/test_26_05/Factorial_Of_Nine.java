package test_26_05;

public class Factorial_Of_Nine {

    public static void main(String[] args) {
        int num=9;
        int factorial=1;
        for (int i=1;i<=num;i++){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+ num+ " is "+factorial);
    }
}
