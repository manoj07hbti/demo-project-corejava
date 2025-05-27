package test_26_05;

public class Factorial {
    public static void main(String[] args) {

        int number=6;
        int answer=1;

        for (int i=6; i>=1; i--){
            answer*=i;
            }
        System.out.println("the factorial of "+number+" is "+answer);
        }

    }

