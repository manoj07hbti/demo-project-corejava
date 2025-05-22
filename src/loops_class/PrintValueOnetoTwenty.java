package loops_class;

public class PrintValueOnetoTwenty {

    public static void main(String[] args) {
        // write a code to print 1 to 20 value
        //using for loop Increment
        for (int i=1;i<=20;i++){
            System.out.println("Count Value.."+i);

        }

        //Using for Loop Decrement
        for (int j=20;j>0;j--){
            System.out.println("Reverse count..."+j);
        }

        //Using while loop
        int k=1;
        while(k<=20){
            System.out.println("While Loop Count.."+k);
            k++;
        }

        // Decrement
        int m=20;
        while(m>0){
            System.out.println("Reverse While Loop.."+m);
            m--;
        }


    }
}
