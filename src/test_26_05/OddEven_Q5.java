package test_26_05;

public class OddEven_Q5 {
    public static void main(String[] args) {

       // Q5-Write a code to check even and odd number between 3 to 300

        for(int i=3 ; i<=300 ; i++){
            if( i%2==0 ){
                System.out.println(i + ": is even number");
            }else{
                System.out.println(i + ": is odd number");
            }
        }
    }
}
