package arrays;

public class ArrayAssignment_Distance {
    public static void main(String[] args) {

        // Example of  distance using for loop
        int[] distance={ 234 , 764 , 525 , 6775 , 7643 , 356 , 4342 , 654 , 6456 };

        System.out.println("Example of distance:" +distance[2]);


        for(int i=0; i<9; i++) {
            System.out.println("Printing Array Distance using for loop: " + i + " " + distance[i]);
        }

        // Example of  distance using while loop
        int i=0;
        while(i<9){
            System.out.println("Printing Array Distance using while loop: " + i + " " + distance[i] );
            i++;
        }

        //Example of  distance using do while loop
        int j=0;
        do{
            System.out.println("Printing Array Distance using do while loop: " + j + " " + distance[j]);
            j++;
        }while(j<9);

        //Example of distance using advance loop
        for( int distances:distance ){
            System.out.println("Printing Array Distance using advance loop: " + j + distances);
        }


    }
}
