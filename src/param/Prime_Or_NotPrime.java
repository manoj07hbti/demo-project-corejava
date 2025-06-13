package param;

public class Prime_Or_NotPrime {

    public void prime_Or_NotPrime(int a, int b){

        for (int i=a; i<=b; i++){
            boolean flag=true;
            if (i==a){
            }else{
                for (int j=2;j<i; j++){
                    if (i%j==0){
                        flag=false;
                    }
                }
            }
            if (flag){
                System.out.println(i+" is prime number");
            }else{
                System.out.println(i+" is not prime number");
            }
        }
    }

    public static void main(String[] args) {
        Prime_Or_NotPrime obj= new Prime_Or_NotPrime();
        obj.prime_Or_NotPrime(1,30);
        obj.prime_Or_NotPrime(30,50);
        obj.prime_Or_NotPrime(50,70);
    }
}
