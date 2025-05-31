package arrays;

public class ArrayDistance {
    public static void main(String[] args) {
// print arrayDistance using for loop

        int distance[] = {300, 450, 700, 90, 500};
        String state[] = {"delhi"};
        String states[] = {"mathura", "punjab", "kolkata", "haryana", "mumbai"};
        // System.out.println(distance[3]);

       for (int i = 0; i <= 4; i++) {
            System.out.println(state[0] + " to " + states[i] + "=" + distance[i] + "km");

        }
        System.out.println();

// print arrayDistance using while loop

        int j = 0;
        while (j<=4){
            System.out.println(state[0] +" to "+ states[j] +"="+ distance[j]+"km");
            j++;
        }
        System.out.println();

// print arrayDistance using Do while loop

        int k=0;
        do {
            System.out.println(state[0] +" to "+ states[k] +"="+ distance[k]+"km");
            k++;
        }while (k<=4);
        System.out.println();
        // print arrayDistance using advance loop


        for (String name : state) {
                for (String names : states) {
                    for (int dis: distance){
                        System.out.println( name+" to "+ names+"=" +dis);
                    }

                }

            }
        }


    }



