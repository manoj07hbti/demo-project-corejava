package Array;

public class First {
    public static void main(String[] args) {
        String Fruits[] = {"Apple", "Banana", "Papaya", "Guava", "Mango"};

        // Using for loop

        for (int i = 0; i< 5; i++){
            System.out.println(Fruits[i]+" Fruit");
        }


        // Using While loop

        int j = 0;
        while(j<5){
            System.out.println(Fruits[j]+" Fruit");
            j++;
        }



        // Using do while loop

        int k = 0;
        do {
            System.out.println(Fruits[k]+" Fruit");
            k++;
        }while (k<5);
    }
}
