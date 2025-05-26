package loops_concept;

public class Infinite_Loop_Using_WhileAndDoWhile {
    public static void main(String[] args) {

        /*SYNTAX:  while (condition){
            //code
            increment/decrement;
        }*/

        int y=1;
        while(y>=1){
            System.out.println("This is infinite loop using while loop concept..." +y);
            y++;
        }

        //do {
        //   CODE
        //   increment/decrement;
        //} while(condition);

        int i=1;
        do{
            System.out.println("This is infinite loop using do while... " +i);
            i--;
        }while (i<=1);
    }
}
