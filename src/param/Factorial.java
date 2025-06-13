package param;

public class Factorial {

    public void factorial(int a, int b){

        int number =a;
        int result=b;

        for (int i=a; i>=b; i--){
            result*=i;
        }
        System.out.println("factorial of "+number+" is "+result);
    }
    public static void main(String[] args) {
        Factorial obj= new Factorial();
        obj.factorial(5,1);
        obj.factorial(10,1);
        obj.factorial(15,1);
    }
}
