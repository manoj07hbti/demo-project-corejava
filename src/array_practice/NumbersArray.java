package array_practice;

public class NumbersArray {
    public static void main(String[] args) {

        int number[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(number[5]);

// print numbers using for loop

        for (int i=0; i<=9; i++){
            System.out.println(number[i]);
        }
        System.out.println();

// print numbers using While loop
        int i=0;
        while (i<=9){
            System.out.println(number[i]);
            i++;
        }
        System.out.println();

// print numbers using do While loop
        int j=0;
       do {
           System.out.println(number[j]);
           j++;
       }while (j<=9);
        System.out.println();

// print numbers using Advanced loop
        for (int num:number){
            System.out.println(num);
        }
    }

}
