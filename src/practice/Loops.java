package practice;

public class Loops {

    public static void main(String[] args) {
// print even numbers 1 to 100 using for loop

        for (int i=1; i<=100; i++){
            if (i%2==0){
                System.out.println("print even numbers= "+i);
            }
        }
// print even numbers 1 to 100 using for loop

        for (int i=2; i<=100; i+=2){
            System.out.println("print even numbers= "+i);
        }
    }
}
