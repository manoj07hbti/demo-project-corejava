package test_.test_26_05;

public class MinusThree_To_PositiveThree {

    public static void main(String[] args) {

        //Q1-Write a program to print
        //
        //-3
        //-2
        //-1
        //0
        //1
        //2
        //3

        //using For Loop

        for (int i=-3;i<=3;i++){
            System.out.println("Print -3 to 3 using for Loop.."+i);
        }

        // Using while Loop
        int j=-3;
        while(j<=3){
            System.out.println("Print -3 to 3 using While Loop.."+j);
            j++;
        }

        // do while Loop

        int k=-3;
        do {
            System.out.println("Print -3 to 3 using do while Loop.."+k);
            k++;
        }while(k<=3);
    }

}
