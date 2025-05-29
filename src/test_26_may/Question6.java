package test_26_may;

public class Question6 {
    public static void main(String[] args) {

        int number=6;
        int factorial=1;
        for(int i=number; i>0; i--){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
