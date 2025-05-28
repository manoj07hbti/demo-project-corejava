package test_26_05;

import java.sql.SQLOutput;

public class Prime_Number {

    public static void main(String[] args) {

        for (int num=1;num<=20;num++) {
            boolean primeNumber = true;

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    primeNumber = false;
                } else {

                }
            }

            if (primeNumber) {
                System.out.println("Prime Number B/w 1 to 20 " + num);
            } else {
               // System.out.println("Number is Not..."+num);
            }
        }
    }
}
