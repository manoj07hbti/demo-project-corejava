package test_26_05;

public class PrintStarPattern {
    public static void main(String[] args) {
// write a program to print star...

        for (int i=1; i<=3; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
            }

        for (int i = 2; i>=1; i--){
            for (int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }


