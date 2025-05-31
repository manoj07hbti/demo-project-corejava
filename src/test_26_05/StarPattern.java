package test_26_05;

public class StarPattern {
    public static void main(String[] args) {

        //write a program to print
        //*
        //**
        //***
        //****
        //*****

        for (int i=1; i<=5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //1
        //12
        //123
        //1234
        //12345

        for (int i=1; i<=5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

       // write a program to print
                //*
                //**
                //***
                //**
                //*

        for (int a=1; a<=3; a++){
            for (int b=1; b<=a; b++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
