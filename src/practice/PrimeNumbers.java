package practice;

public class PrimeNumbers {
    public static void main(String[] args) {

        boolean flag=true;

        int number=11;
        for (int i=2; i<number; i++){
            if (number%i==0){
                flag=false;
            }else{

            }
        }
        if (flag){
            System.out.println(number+" is a prime number");
        }else{
            System.out.println(number+" is not a prime number");
        }
    }
}
