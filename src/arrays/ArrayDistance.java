package arrays;

public class ArrayDistance {
    public static void main(String[] args) {
// print arrayDistance using for loop

        int distance[] = {300, 450, 700, 90, 500};
        String states[] = {"mathura", "punjab", "kolkata", "haryana", "mumbai"};
        String state ="delhi";
        // System.out.println(distance[3]);

       for (int i = 0; i <= 4; i++) {
            System.out.println(state + " to " +states[i] + "= " + distance[i] + "km");

        }
        System.out.println();

// print arrayDistance using while loop

        int j = 0;
        while (j<=4){
            System.out.println(state +" to "+ states[j] +"= "+ distance[j]+"km");
            j++;
        }
        System.out.println();

// print arrayDistance using Do while loop

        int k=0;
        do {
            System.out.println(state +" to "+ states[k] +"= "+ distance[k]+"km");
            k++;
        }while (k<=4);
        System.out.println();
        // print arrayDistance using advance loop


        for (int i = 0; i < 5; i++) {
            System.out.println( state+" to "+ states[i] + "= " + distance[i] + " km");
        }
        System.out.println();


        int m=0;
        for (String city: states){
                System.out.println(state+ " to "+ city+ "= "+distance[m]);
                m++;
            }

        }
    }






