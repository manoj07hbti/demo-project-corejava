package arrays;

public class ArrayAssignment_Height {
    public static void main(String[] args) {

        // Printing height using for loop
        double[] height={ 4.6 , 5.4 , 6.1 , 4.4 , 5.5 , 5.8 , 6.3 , 6.8 ,6.7 };
        System.out.println( "Example of height: " +height[5]);
        for(int i=0; i<5; i++) {
            System.out.println("Printing Height using for loop: " + i + " " + height[i]);
        }

        //Printing height using while loop
        int i=0;
        while( i<8 ){
            System.out.println("Printing height using while loop: " + i + " :- " + height[i]);
            i++;
        }

        //Printing height using do while loop
        int j=0;
        do{
            System.out.println("Printing height using do while loop: " + j + " :- " + height[j]);
            j++;
        }while(j<8);

        //Printing height using advanced loop
        for( double heights: height){
            System.out.println("Printing height using advance loop: "  + heights);
        }

    }
}
