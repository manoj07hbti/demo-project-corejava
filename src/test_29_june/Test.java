package test_29_june;

public class Test {

    // write a code to check any  number between 7 to 190 is divisible by 7
    // And it should not be odd number

    public void divisible1() {

        System.out.println("Numbers between 7 to 190 that are divisible by 7 and even:- ");
        for (int i = 7; i <= 190; i++) {
            if (i % 7 == 0 && i % 2 == 0) {
                System.out.println(i + " even numbers");
            }
        }
    }

    // write a code to print square of number between 1 to 10

    public void square() {

        System.out.println();
        System.out.println("the square of number between 1 to 10 :-");
        for (int i = 1; i <= 10; i++) {
            int number = i * i;
            System.out.println("square of " + i + " is " + number);
        }
    }

    // write a code to check any number between 3 to 160 is divisible by 9
    // And it should not be odd number

    public void divisible2() {

        System.out.println();
        System.out.println("Numbers between 3 to 160 that are divisible by 9 and even:- ");
        for (int i = 3; i <= 160; i++) {
            if (i % 9 == 0 && i % 2 == 0) {
                System.out.println(i + " even numbers");
            }
        }

    }

    //write a code to print cube of number starting from 1 to 10

    public void cubes() {

        System.out.println();
        System.out.println("the cube of 1 to 10 :-");
        for (int i = 1; i <= 10; i++) {
            int number = i * i * i;
            System.out.println("cube of " + i + " is " + number);
        }
    }

    //write a code to check any number number between 8 to 160 is divisible by 11
    // And it should not be odd number

    public void divisible3() {

        System.out.println();
        System.out.println("Numbers between 7 to 190 that are divisible by 11 and even:- ");
        for (int i = 8; i <= 160; i++) {
            if (i % 11 == 0 && i % 2 == 0) {
                System.out.println(i + " even numbers");
            }
        }
    }

    //write a code to check prime number between 1 to 10

    public void primeNumber() {

        System.out.println();
        System.out.println("Prime number between 1 to 10 is :-");

        boolean flag = true;
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i +" is prime number");
            } else {

            }
        }
    }

    //write a code to check any number between 180 to 1 is divisible by 11
    // And it should not be odd number

    public void divisible4(){

        System.out.println();
        System.out.println("Numbers between 180 to 1 that are divisible by 11 and even:-");
        for (int i=180; i>=1; i--){
            if (i%11==0 && i%2==0){
                System.out.println(i+ "even numbers");
            }
        }
    }

    public void primeNumber2() {

        //write a code to check prime number between 10 to 20

        System.out.println();
        System.out.println("prime number between 10 to 20:- ");


        for (int i = 10; i <= 20; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i + " is prime number");
            }
        }
    }


    public static void main (String[]args){
        Test div = new Test();
        div.divisible1();

        Test div2 = new Test();
        div2.divisible2();

        Test div3 = new Test();
        div3.divisible3();

        Test div4=new Test();
        div4.divisible4();

        Test squ = new Test();
        squ.square();

        Test cube = new Test();
        cube.cubes();

        Test prime = new Test();
        prime.primeNumber();

        Test prime2 =new Test();
        prime2.primeNumber2();

    }
}



