package loops_concept;

public class Even_1_To_100Using_For_while_And_DoWhile {
    public static void main(String[] args) {

        //Printing all even number between 1 to 100 using for and while , do while loop

        for(int i=2; i<=100; i++){
            System.out.println("printing all Even number using for loop:" +i++);
        }

        int i=2;
        while(i<=100){
            System.out.println("printing all Even number using while loop:" +i++);
           i++;
        }

        int j=2;
        do{
            System.out.println("printing all Even number using do while loop:" +j++);
            j++;
        }  while(j<=100);
    }
}
