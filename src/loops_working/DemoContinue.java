package loops_working;

public class DemoContinue {

    public static void main(String[] args) {

        for(int i=1; i<=10; i++){

            if(i==5){
                continue;
            }
            System.out.println("Printing in loop :"+i);
        }



    }
}
