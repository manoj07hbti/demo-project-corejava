package test_26_05;

import java.util.Arrays;

public class Star_Pattern {
    public static void main(String[] args) {

        //Q4- write a program to print
        //
        //*
        //**
        //***
        //**
        //*
        // For Upper Star Pattern
        for (int i=1;i<=3;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // For Lower Star Pattern
        for (int i=1;i<=3;i++){
            for (int j=2;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
