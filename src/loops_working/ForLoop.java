package loops_working;

public class ForLoop {

    public static void main(String[] args) {

        // print value 1 to 20

        for (int a = 1; a <= 20; a++) {
            System.out.println("print value 1 to 20 :" + a);

        }

        //Print Value 50 To 25

        for (int b = 50; b >= 25; b--) {
            System.out.println("Print Value 50 To 25: " +b);
        }

        //print Value 25 to 50

        for (int c=25; c<=50; c++){
            System.out.println("print Value 25 to 50 :"+ c);
        }

        //print even number between 1 to 100
         int number=2;
        for (int i=1; i<=50; i++){
            System.out.println(number*i);
        }

        //print odd number between 1 to 100
        number=2;
        for (int j=1; j<=50; j++ ){
            System.out.println(number*j-1);
        }

    }
}