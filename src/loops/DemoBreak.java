package loops;

public class DemoBreak {

    public static void main(String[] args) {

        // we need to exit loop when value of i is 3

        for(int n=0; n<=10; n++){

            if (n==3){
                break;
            }

            System.out.println("Printing my loop..."+n);
        }


    }
}
