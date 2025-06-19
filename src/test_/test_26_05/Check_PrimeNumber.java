package test_.test_26_05;

public class Check_PrimeNumber {
    public static void main(String[] args) {
        //Q2-write a program to check prime numbers between 1 to 20
        System.out.println("Prime numbers between 1 and 20:");


        for (int i=1;i<=20;i++){
            boolean isPrime=true;

        for (int j=2;j<i;j++){
                if (i%j ==0) {
                    isPrime = false;
                }else{

                }
            }
            if (isPrime){
                System.out.println(i);
            }else{

            }
        }
    }
}
