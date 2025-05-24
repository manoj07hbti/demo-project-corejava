package loops_working;

public class TableLoop {
    public static void main(String[] args) {

        //using for loop
        //print table of 2
        int number =2;
        for (int a=1; a<=10; a++){
            System.out.println("2*"+a+"="+number*a);
        }

        //Print table of 5
        number=5;
       for (int b=1; b<=10; b++){
           System.out.println("5*"+b+"="+number*b);
       }

        //Print table of 10
        number=10;
        for (int b=1; b<=10; b++){
            System.out.println("10*"+b+"="+number*b);
        }

        //using while loop
        //Print table of 5

        number=5;
        int c=1;
        while (c<=10){
            System.out.println("5*"+c+"="+number*c);
            c++;
        }

        //print table of 10

        number=10;
        int a=1;
        while (a<=10){
            System.out.println("10*"+a+"="+number*a);
            a++;
        }

        //Using Do While Loop
        //Table of 5

        number=5;
        int i=1;
        do {
            System.out.println("5*"+i+"="+number*i);
            i++;
        }while (i<=10);

        //table of 10
        number=10;
        int j=1;
        do {
            System.out.println("10*"+j+"="+number*j);
            j++;
        }while (j<=10);

    }
}
