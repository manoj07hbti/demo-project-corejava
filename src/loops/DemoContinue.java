package loops;

public class DemoContinue {

    public static void main(String[] args) {

        for(int n=1; n<=10; n++){

            if(n==5){
                continue;
            }
            System.out.println("Printing in loop :"+n);
        }


    }
}
