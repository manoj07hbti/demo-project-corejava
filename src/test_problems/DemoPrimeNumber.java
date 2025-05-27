package test_problems;

public class DemoPrimeNumber {

    public static void main(String[] args) {
        // Any number which is divisible by 1 or themself
        // 3 , 7 , 11, 13, 17 , 19
        // we need to check if number is divisible between 2 to number-1
        //   i=2; i<number
        boolean flag=true;
        int number=8;
        for(int i=2; i<number; i++) {
            if(number%i==0){
              flag=false;
            }else {

            }

        }

        if(flag){
            System.out.println("Number is prime number...");
        }else {
            System.out.println("Number is not Prime number...");
        }
    }

}
