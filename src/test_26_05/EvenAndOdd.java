package test_26_05;

public class EvenAndOdd {
    public static void main(String[] args) {
        //write a code to check even and odd number between 3 to 300
       int number=2;
        for (int a=2; a<=150; a++ ){
            System.out.println("even number:" + a*number);
        }

       number=2;
        for (int b=1; b<150; b++){
            System.out.println(number*b+1);
        }
    }
}
