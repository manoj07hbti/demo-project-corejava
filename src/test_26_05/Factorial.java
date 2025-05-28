package test_26_05;

public class Factorial {

    public static void main(String[] args) {


        // 4 = 4X3X2X1= 24
        // 5 = 5X4X3X2X1=120

        int number=8; //7X6X5X4X3X2X1
        int factorial=1;

        for(int i=number; i>0; i--){
            //  factorial=factorial*i;
            factorial*=i;
        }
        System.out.println(factorial);


    }
}
