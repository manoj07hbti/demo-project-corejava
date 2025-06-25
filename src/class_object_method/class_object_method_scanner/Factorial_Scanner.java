package class_object_method.class_object_method_scanner;


import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Factorial_Scanner {

    public int factorial(int num){
        if (num==0 || num==1){
            return 1;
        }else {
            return num *factorial(num-1);
        }
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        Factorial_Scanner output = new Factorial_Scanner();

        System.out.println("Please Enter number : ");
        int number = obj.nextInt();
        System.out.println("Factorial of Entered Number: "+output.factorial(number));

    }


}
