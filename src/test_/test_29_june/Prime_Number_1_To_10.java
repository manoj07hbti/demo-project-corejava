package test_.test_29_june;

public class Prime_Number_1_To_10 {


    public void checkPrimeNumber(){
        System.out.println("***************** Prime number between 1 to 10 **************");

        for (int i=1;i<=10;i++){
            boolean isPrime=true;

            for (int j=2;j<i;j++){
                if (i%j ==0) {
                    isPrime = false;
                }else{

                }
            }
            if (isPrime){
                System.out.print(i+", ");
            }else{

            }
        }
    }

    public static void main(String[] args) {

        Prime_Number_1_To_10 obj = new Prime_Number_1_To_10();
        obj.checkPrimeNumber();

    }
}
