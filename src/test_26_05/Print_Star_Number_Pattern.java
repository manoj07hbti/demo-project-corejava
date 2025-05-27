package test_26_05;

public class Print_Star_Number_Pattern {

    public static void main(String[] args) {
        /* Q4- write a program to print
        //
        //*
        //**
        //*
        //**
        //*
        1
        12
        123
        1234
        12345 */

        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

       /* System.out.println("*");
        System.out.println("**");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        */

        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
