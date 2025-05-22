package loops_class;

public class AllLoops_OneToHundred_Even {

    public static void main(String[] args) {
        //Print all even number between 1 to 100 using for and while , do while loop

        //Using For Loop
        for (int i=1;i<=100;i++){
            if (i%2 ==0){
                System.out.println("Even Number Between one to Hundred.."+i);
            }

        }

        //Using While Loop
        int j=1;
        while(j<=100){
            if (j%2 ==0){
                System.out.println("Using While Loop Even Number Between one to Hundred.."+j);
            }
            j++;
        }

        //Using Do while
        int k=1;
        do{
            if (k%2 ==0){
                System.out.println("Using DO While Loop Even Number Between one to Hundred.."+k);
            }
            k++;
        }while(k<=100);


    }
}
