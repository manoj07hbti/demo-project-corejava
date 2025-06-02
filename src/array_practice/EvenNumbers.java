package array_practice;

public class EvenNumbers {
    public static void main(String[] args) {

        double percentage[] = {55.8, 87.9, 90.1, 78.3};
        String name[] = {"student1", "student2", "student3", "student4"};
        //  System.out.println(number[6]);

// print percentage using for loop

        for (int i = 0; i <= 3; i++) {
            System.out.println(name[i] + " percentage= " + percentage[i]);
        }
        System.out.println();

// print percentage using While loop

        int i = 0;
        while (i <= 3) {
            System.out.println(name[i] + " percentage= " + percentage[i]);
            i++;
        }
        System.out.println();

// print percentage using Do While loop

        int j = 0;
        do {
            System.out.println(name[j] + " percentage= " + percentage[j]);
            j++;
        } while (j <= 3);
        System.out.println();

// print percentage using advanced loop

        for (double num : percentage) {
            for (String nam : name) {
                System.out.println(nam + num);
            }
        }
    }
}