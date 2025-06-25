package class_object_method.class_object_method_scanner;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class OddEven_Scanner {

    public boolean isEven(int num){
        return num % 2 ==0;
    }


    public static void main(String[] args) {

        Scanner obj =new Scanner(System.in);

        OddEven_Scanner oddEvenCheck = new OddEven_Scanner();

        System.out.println(" Please Enter a number to check Odd or Even: ");
        int number = obj.nextInt();

        if (oddEvenCheck.isEven(number)){
            System.out.println(number +" is  Even Number");
        }else {
            System.out.println(number +" is  Odd Number");
        }
    }
}
