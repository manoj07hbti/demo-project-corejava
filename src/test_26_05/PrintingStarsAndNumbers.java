package test_26_05;

public class PrintingStarsAndNumbers {
    public static void main(String[] args) {

        //Q3- write a program to print 1 to 5 in ascending order
        //1
        //12
        //123
        //1234
        //12345

        for(int i=1 ; i<=5 ; i++){
            for(int j=1; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        // printing star pattern
        //*
        //**
        //***
        //****
        //*****

        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
