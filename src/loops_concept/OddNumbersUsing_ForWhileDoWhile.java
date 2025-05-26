package loops_concept;

public class OddNumbersUsing_ForWhileDoWhile {
    public static void main(String[] args) {

        //Printing all odd number between 1 to 100 using for, while & do while loop

        for(int i=1; i<=100; i++){
            System.out.println("printing all odd number using for loop:" +i++);
        }

        int i=1;
        while(i<=100){
            System.out.println("printing all odd number using while loop:" +i++);
            i++;
        }

        int j=1;
        do{
            System.out.println("printing all odd number using do while loop:" +j++);
            j++;
        }while(j<=100);
    }
}
