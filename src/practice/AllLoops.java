package practice;

public class AllLoops {
    public static void main(String[] args) {
// For loop 1 to 20 numbers

        for (int i=1; i<=20; i++){
            System.out.println("For print numbers= "+i );
        }
// while loop 1 to 20 numbers

        int i=1;
        while (i<=20){
            System.out.println("While print numbers= "+i);
            i++;

        }
// DO while loop 1 to 20 numbers

        int j=1;
        do {
            System.out.println("Do While print numbers= "+j);
            j++;
        } while (j<=20);

// nested loop 1 to 20 numbers

        for (int k=1; k<=20; k++){

            for (int l=1; l<=20; l++){
                System.out.println(" print numbers= k "+k+ " l= "+l);
            }
        }




    }

}
