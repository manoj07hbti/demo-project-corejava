package test_26_05;

public class PrintingLoop {

    public static void main(String[] args) {


        for (int k=-3; k<=3; k++){

            System.out.println("printing program...." + k );

        }

        for (int i=1; i<=5; i++){

            for (int n=1; n<=i; n++){
                System.out.print("*");

            }
            System.out.println("");


        }

        for (int i=1; i<=5; i++){

            for (int n=1; n<=i; n++){
                System.out.print(n);

            }
            System.out.println("");


        }




        for (int i=1; i<=3; i++) {

            for (int n = 1; n <= i; n++) {
                System.out.print("*");

            }
            System.out.println("");
        }

            for (int k = 2; k >= 1; k--) {

                for (int v = 1; v <= k; v++) {

                    System.out.print("*");
                }
                System.out.println("");


            }
        }

    }

