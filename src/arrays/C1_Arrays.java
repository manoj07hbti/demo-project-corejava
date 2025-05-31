package arrays;

public class C1_Arrays {
    public static void main(String[] args) {

        // we need to store names of employers working in office
        // Datatype varName [] = {value1, va    value2,value3.......value N};

        String employers[]={"Rohit","Rahul","Tikku","Lakshay","Gourav" };
        System.out.println(employers [ 1] );
        System.out.println(employers[2]);

        for ( int i=0 ; i<5 ; i++){
            System.out.println("Name of the employers using for loop:- " + i + " " + employers[i]);
        }

           int  i=0;
           while(i<5){
               System.out.println("Name of the employers using while loop:- " + i + " " + employers[i]);
           i++;
           }

           int x=0;
           do{
            System.out.println("Name of the employers using do while loop:- " + x + " " + employers[x]);
            x++;
        }while (x<5);



       }
    }
