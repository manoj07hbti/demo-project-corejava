package loops_;

public class For_Loop {

    public static void main(String[] args) {
        // write a code to print Hello world 5 times.

        //start : 1  check <5   exit >5

        // for Loop Increment operator

                /* SYNTAX: for (start_condition; conditional_expression; increment){
            //CODE
        }*/

        for (int i=1;i<=5;i++) {
            System.out.println("Java Class.." + i);

        }

        // for Loop Decrement operator
       /*SYNTAX: for (start_condition; conditional_expression; decrement){
            //CODE
        }*/

        for (int j=5;j>0;j--){
            System.out.println("Decrement..: Java Class.."+j);
        }


        //while loop
        int k=1;
        while(k<=5){
            System.out.println("While Loop: Hello world.."+k);
            k++;
        }

    }
}
