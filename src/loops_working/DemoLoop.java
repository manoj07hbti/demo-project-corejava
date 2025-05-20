package loops_working;

public class DemoLoop {

    public static void main(String[] args) {

        // I want to print hello world 5 times
       /* System.out.println("Hello World...");//1
        System.out.println("Hello World...");//2
        System.out.println("Hello World...");//3
        System.out.println("Hello World...");//4
        System.out.println("Hello World...");//5*/

        //start : 1  check <5   exit >5
       /* SYNTAX: for (start_condition; conditional_expression; increment){
            //CODE
        }*/

        //INCREMENT FOR LOOP
        for(int i=1; i<=5; i++){
            System.out.println("Hello World..."+i);
        }

        //DECREMENT FOR LOOP
        /*SYNTAX: for (start_condition; conditional_expression; decrement){
            //CODE
        }*/
        //5,4,3,2,1
        for(int j=5; j>0; j--){
            System.out.println("Decrement for Loop : Hello World..." +j);

        }

        /*SYNTAX:  while (condition){
            //code
            increment/decrement;
        }*/
        int k=1;
        while(k<=5){
            System.out.println("While Loop : Hello World..."+k);
            k++;
        }

    }
}
