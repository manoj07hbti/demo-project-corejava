package practice;

public class PrimeNumber {
    public static void main(String[] args) {

        boolean flag=true;
        int i=1;
        while (i<=50){
            i++;

        int j=1;
        while (j<i){
            j++;
            while (j%i==0){
                flag=false;
            }
        }

        }
        if (flag){
            System.out.println(i+" is prime number");
        }else{
            System.out.println(i+" is not a prime number");
        }
    }
}
