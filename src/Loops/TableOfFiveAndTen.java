package Loops;

public class TableOfFiveAndTen {
    public static void main(String[] args) {

        // Table of five using for loop

        for(int i = 1; i<=10; i++){
            System.out.println("5 X "+i+" = "+(5*i));
        }


        // Table of five using While loop

        int j = 1;
        while (j<=10){
            System.out.println("5 X "+j+" = "+(5*j));
            j++;
        }

        // Table of five using do While loop

        int k = 1;
        do {
            System.out.println("5 X "+k+" = "+(5*k));
            k++;
        }while (k<=10);



        // Table of Ten using for loop

        for(int l = 1; l<=10; l++){
            System.out.println("10 X "+l+" = "+(10*l));
        }


        // Table of five using While loop

        int i = 1;
        while (i<=10){
            System.out.println("10 X "+i+" = "+(10*i));
            i++;
        }

        // Table of five using do While loop

        int a = 1;
        do {
            System.out.println("10 X "+a+" = "+(10*a));
            a++;
        }while (a<=10);
    }
}
