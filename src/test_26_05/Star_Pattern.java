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

        // TODO Using while Loop for Pattern
        //Uuper Star
        int k=1;
        while(k<=5){
            int l=1;
            while(l<=k){
                System.out.print(" *");
                l++;
            }
            System.out.println();
            k++;
        }

        //
        int a=1;
        while(a<=5){
            int b=4;
            while(b>=a){
                System.out.print(" *");
                b--;
            }
            System.out.println();
            a++;
        }



    }

}
