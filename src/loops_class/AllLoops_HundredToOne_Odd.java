package loops_class;

public class AllLoops_HundredToOne_Odd {

    public static void main(String[] args) {

    //Print all even number between 100 to 1 using for and while , do while loop

        for (int i=100;i>=1;i--){
            if(i%2 !=0){
                System.out.println("Reverse odd Number B/w 100 to 1..."+i);
            }
        }

        for(int j=2;j<=100;j+=2){
            System.out.println("Eveen Number.."+j);

        }


    }
}
