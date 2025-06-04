package arrays;

public class ArrayHeight {
    public static void main(String[] args) {

        double height[] = {8.4, 9.10, 5.8, 4.6};
        String names[] = {"person1", "person2", "person3", "person4"};

// print arrayHeight using for loop

        for (int i = 0; i <= 3; i++) {
            System.out.println(names[i] + " height= " + height[i]);
        }
        System.out.println();

// print arrayHeight using while loop

        int i = 0;
        while (i <= 3) {
            System.out.println(names[i] + " height= " + height[i]);
            i++;
        }
        System.out.println();

// print arrayHeight using Do While loop

        int j = 0;
        do {
            System.out.println(names[j] + " height= " + height[j]);
            j++;
        } while (j <= 3);
        System.out.println();

// print arrayHeight using advanced loop
        for (int k=0; k< names.length; k++){
            System.out.println(names[k]+" height= "+height[k]);
        }

    }
}






