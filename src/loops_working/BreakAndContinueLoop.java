package loops_working;

public class BreakAndContinueLoop {
    public static void main(String[] args) {

         //BREAK
        // we need to exit loop when value of i is 3

        for(int i=0; i<=10; i++){

            if (i==3){
                break;
            }

            System.out.println("Printing my loop..."+i);
        }

        //CONTINUE

        for(int i=1; i<=10; i++){

            if(i==5){
                continue;
            }
            System.out.println("Printing in loop :"+i);
        }


    }
}
