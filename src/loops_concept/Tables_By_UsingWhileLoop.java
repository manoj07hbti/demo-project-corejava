package loops_concept;

public class Tables_By_UsingWhileLoop {
    public static void main(String[] args){

        //Table of 2 (2*1=2) using while loop
         /*SYNTAX: dataType
          while (condition){
            //code
            increment/decrement;
        }*/

        int number=2;
        int i=1;
        while(i<=10){
            System.out.println(number + " * " + i + " = " + (number * i));
            i++;
        }


        //Table of 5 using while loop
        number=5;
        int j=1;
        while(j<=10){
            System.out.println(number + " * " + j + " = " + (number*j));
            j++;
        }


        //Table of 10 using while loop
        number=10;
        int k=1;
        while(k<=10){
            System.out.println(number + " i " + k + " = " + (number*k));
            k++;
        }


    }
}