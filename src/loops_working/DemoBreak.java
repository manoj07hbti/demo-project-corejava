package loops_working;

public class DemoBreak {

    public static void main(String[] args) {

        // we need to exit loop when value of i is 3

        for(int i=0; i<=10; i++){

            if (i==3){
                break;
            }

            System.out.println("Printing my loop..."+i);
        }


    }
}
