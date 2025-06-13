package assignment_methods_and_call;

public class PrimeNumber {
    //write a method to check Prime number
    public void primeChecker() {
        int number = 80;
        if (number <= 1) {
            System.out.println("number is not prime:"+number);
            if (number<=3){
                System.out.println("number is prime:"+number);
            }
            if (number%2==0||number%3==0){
                System.out.println("number is not prime"+number);
            }
        }
        for (int i=5;i*i<=number;i+=6){
            if (number%i==0||number%(i+2)==0){
                System.out.println("number is not prime");
            }else {
                System.out.println("number is prime");
            }
        }
    }

    public static void main(String[] args) {
        PrimeNumber obj1=new PrimeNumber();
        obj1.primeChecker();
    }
}
