package Test_29_june;

import variable.Test;

public class Test_First {
    /*
    write a code to check any number number between 7 to 190 is divisible by 7 and it should not be odd number
    write a code to print square of number between 1 to 10
    like  1 , 4, 9, 16 ,25 ....100

    write a code to check any number number between 3 to 160 is divisible by 9 and it should not be odd number
    write a code to print cube of number starting from 1 to 10
    like 1, 8 , 27, 64 ....1000

    write a code to check any number number between 8 to 160 is divisible by 11 and it should not be odd number
    write a code to check prime number between 1 to 10

    write a code to check any number number between 180 to 1 is divisible by 11 and it should not be odd number
    write a code to check prime number between 10 to 20
     */

    public void First(){
        //write a code to check any number number between 7 to 190 is divisible by 7 and it should not be odd number
        System.out.println("Test Question 1 Output");
        for(int i=7; i<=190; i++){
            if(i%2 == 0){
                if (i%7 == 0){
                    System.out.println("Divide by 7 between (7 to 190): "+i);
                }
            }
        }
    }

    public void Second(){
        //write a code to print square of number between 1 to 10
        //    like  1 , 4, 9, 16 ,25 ....100
        System.out.println("Test Question 2 Output");
        for (int i = 1; i<=10; i++){
            System.out.println("Square of "+i+" is "+i*i);
        }

    }

    public void Third(){
        //write a code to check any number number between 3 to 160 is divisible by 9 and it should not be odd number
        System.out.println("Test Question 3 Output");
        for(int i=3; i<=160; i++){
            if(i%2 == 0){
                if (i%9 == 0){
                    System.out.println("Divide by 9 between (3 to 160): "+i);
                }
            }
        }
    }

    public void Fourth(){
        //write a code to print cube of number starting from 1 to 10
        //like 1, 8 , 27, 64 ....1000
        System.out.println("Test Question 4 Output");
        for (int i = 1; i<=10; i++){
            System.out.println("Cube of "+i+" is "+i*i*i);
        }
    }

    public void Fifth(){
        //write a code to check any number number between 8 to 160 is divisible by 11 and it should not be odd number
        System.out.println("Test Question 5 Output");
        for(int i=8; i<=160; i++){
            if(i%2 == 0){
                if (i%11 == 0){
                    System.out.println("Divide by 11 between (8 to 160): "+i);
                }
            }
        }
    }

    public void Sixth(){
        //write a code to check prime number between 1 to 10
        System.out.println("Test Question 6 Output");
        System.out.println("Prime Number between (1 to 10)");
        for(int i = 2; i<=10; i++){
            boolean flag = true;
            for (int j = 2; j<i; j++){
                if (i%j == 0){
                    flag = false;
                }else {

                }
            }
            if (flag){
                System.out.println(i+" is prime.");
            }else {

            }
        }
    }

    public void Seventh(){
        //write a code to check any number number between 180 to 1 is divisible by 11 and it should not be odd number
        System.out.println("Test Question 7 Output");
        for(int i=180; i>=1; i--){
            if(i%2 == 0){
                if (i%11 == 0){
                    System.out.println("Divide by 11 between (180 to 1): "+i);
                }
            }
        }
    }

    public void Eight(){
        //write a code to check prime number between 10 to 20
        System.out.println("Test Question 8 Output");
        System.out.println("Prime Number between (10 to 20)");
        for(int i = 11; i<=20; i++){
            boolean flag = true;
            for (int j = 2; j<i; j++){
                if (i%j == 0){
                    flag = false;
                }else {

                }
            }
            if (flag){
                System.out.println(i+" is prime.");
            }else {

            }
        }
    }

    public static void main(String[] args) {
        Test_First obj = new Test_First();

        System.out.println("--------------------------------------------------------------------------");
        obj.First();
        System.out.println("--------------------------------------------------------------------------");
        obj.Second();
        System.out.println("--------------------------------------------------------------------------");
        obj.Third();
        System.out.println("--------------------------------------------------------------------------");
        obj.Fourth();
        System.out.println("--------------------------------------------------------------------------");
        obj.Fifth();
        System.out.println("--------------------------------------------------------------------------");
        obj.Sixth();
        System.out.println("--------------------------------------------------------------------------");
        obj.Seventh();
        System.out.println("--------------------------------------------------------------------------");
        obj.Eight();
    }
}
