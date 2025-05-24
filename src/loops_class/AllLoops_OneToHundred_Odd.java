package loops_class;

public class AllLoops_OneToHundred_Odd {

    public static void main(String[] args) {
        //Print all odd number between 1 to 100  using for and while , do while loop
        // Using for Loop
        for (int i=1;i<=100;i++){
            if (!(i%2==0)){
                System.out.println("Odd Number Between one to Hundred.."+i);
            }
        }

        // Using While Loop
        int j=1;
        while(j<=100){
            if (!(j%2 ==0)) {
                System.out.println("Using While Odd Number Between one to Hundred.." + j);
                 }
            j++;
        }

        // Using DO while Loop
        int k=1;
        do{
            if ((k&2) !=0){
                System.out.println("Using Do While Odd Number Between one to Hundred.."+k);
            }
            k++;
        }while (k<=100);


    }
}
