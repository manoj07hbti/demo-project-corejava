package loops_concept;

public class For_And_While_Loop {
    public static void main(String[] args) {

        // 1- print value All is well 1 to 20
        //start : 1  check <5   exit >5
       /* SYNTAX: for (start_condition; conditional_expression; increment){
                //CODE
            }*/
        //INCREMENT FOR LOOP

        for(int i=1; i<=20; i++){
            System.out.println("All is Well..."+i);
        }

        //2- print value "value is decreasing" 50 to 25
        //Decrement Loop

        for(double i=50; i>=25; i--){
            System.out.println("Value is decreasing from 50 to 25:...." +i);
        }


        //3- print value While loop 25 to 50
        /*SYNTAX:  while (condition){
            //code
            increment/decrement;
        }*/

        int y=25;
        while(y<=50){
            System.out.println("While Loop..."+y);
            y++;
        }

        //4- Printing a table of 2

        int number=2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}