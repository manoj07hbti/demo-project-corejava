package arrays;

public class ArrayAssignment_Country {
    public static void main(String[] args) {

        //1. Example of country
            String[] country={ "India","Nepal","Bhutan","china", "New Zealand" ,"America","australia", };
        System.out.println( "Example of country: " + country[3]);

        //By using for loop
        for(int i=0; i<7; i++){
            System.out.println("Printing Array at Country using for loopr1: " +i + " "+country[i]);
        }

        //By using while loop
        int i=0;
        while(i<7){
            System.out.println( "Printing country name using while loop: " +country[i] );
            i++;
        }

        int j=0;
        do{
            System.out.println( "Printing country name using do while loop: " +country[j] );
            j++;
        }while(j<7);

        //Advanced loop
       for(String name: country){
           System.out.println("Printing country name using using Advance loop: " +name);
       }

    }
}
