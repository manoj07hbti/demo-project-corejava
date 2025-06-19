package test_.test_26_05;

public class Factorial_Of_Nine {

    public static void main(String[] args) {
        int num=9;
        int factorial=1;
        for (int i=num;i>0;i--){
            factorial=factorial*i;
        }
        System.out.println("Factorial of "+ num+ " is "+factorial);
    }
}
