package loops_concept;

public class TablesByUsing_DoWhileLoop {
    public static void main(String[] args) {

        //Table by 2 by using do While

        int number=2;
        int i=1;
        do{
            System.out.println(number + " * " + i + " = " +(number*i));
            i++;
        }while (i<=10);


        //Table of 5 by using do while

        number=5;
        int j=1;
        do{ System.out.println(number + " * " + j + " = " +(number*j));
            j++;
        }while (j<=10);

        //Table of 10 using do while

        number=10;
        int k=1;
        do{ System.out.println(number + " * " + k + " = " +(number*k));
            k++;
        }while (k<=10);


    }
}
