package test_26_05;

public class Second_Test {
    public static void main(String[] args) {
        // Q2-write a program to check prime numbers between 1 to 20

        /*
        for (int num = 2; num <= 20; num++) {

            int i = 2;
            while (i <= num / 2) {
                if (num % i == 0) {
                    break;
                } else {
                    i = i + 1;
                }
            }

            if (i > num / 2) {
                System.out.println(num);
            }
        }

        */

        for (int num = 2; num<=20; num++){
            int number = num;
            boolean flag = true;
            for (int i = 2; i<number; i++){
                if (number%i==0){
                    flag = false;
                }else {

                }
            }

            if (flag){
                System.out.println(number+ " is Prime.");
            }else {
                System.out.println(number+ " is not Prime.");
            }
        }


    }
}
