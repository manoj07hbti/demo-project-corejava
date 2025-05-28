package test_26_05;

public class PrimeNumber {
    public static void main(String[] args) {

      for (int i=1; i<=20; i++){
          boolean flag=true;
          for (int j=2; j<i; j++){
              if (i%j==0){
                  flag=false;
              }
          }
          if (flag){
              System.out.println(i+" is prime number");
          }else{
              System.out.println(i+" Not prime number");
          }
      }
    }
}
