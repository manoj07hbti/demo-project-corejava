package arrays;

public class ArrayDistance {

    public static void main(String[] args) {

        int distance[] ={23,45,34,87,56};

        for (int i = 0; i<5  ; i++) {
            System.out.println("printing distance....: " + distance[i]);
        }

            //dowhileloop

            int n=0;
            do {
                System.out.println("printing distance using dowhile...: "+ distance[n]);
                n++;
            }while (n<5);

            //whileloops

        int v=0;
        while (v<5){
            System.out.println("printing distance using whileloop....: "+distance[v]);
            v++;
        }
        //advancedloops

        for (int number: distance){
            System.out.println("printing distance using advanced loops....:"+ number);
        }

    }
}
