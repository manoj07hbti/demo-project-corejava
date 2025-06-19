package test_.test_26_05;

public class AllLoops_ThreeToThreeHundred_Odd {

    public static void main(String[] args) {

        //Q5-Write a code to check even and odd number between 3 to 300

        //Using For Loop

        for (int i=3;i<=300;i++){
            if (i%2 !=0) {
                System.out.println("Odd Number Between 3 to 300..." + i);
            }
        }

        //Using while Loop
        int j=3;
        while(j<=300){
            if (j%2 !=0){
                System.out.println("Using while Loop Odd Number Between 3 to 300..."+j);
            }
            j++;
        }

        // Using do while Loop
        int k=3;
        do {
            if (k%2 !=0){
                System.out.println("Using Do while...."+k);
            }
            k++;
        }while(k<=300);

    }
}

