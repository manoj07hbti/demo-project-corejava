package loops_working;

public class WhileLoop {
    public static void main(String[] args) {

        // print value 1 to 20

        int a=1;
        while (a<=5){
            System.out.println(a);
            a++;
        }

        //Print Value 50 To 25

        int b=50;
        while (b>=25){
            System.out.println(b);
            b--;
        }

        //print Value 25 to 50

        int c=25;
        while (c<=50){
            System.out.println(c);
        c++;
        }

        //print even number 1 to 100
        int number=2;
        int i=1;
        while (i<=50){
            System.out.println(number*i);
            i++;
        }

        //print odd number between 1 to 100
        number=2;
        int j=1;
        while (j<=50){
            System.out.println(number*j-1);
            j++;
        }

    }
}
