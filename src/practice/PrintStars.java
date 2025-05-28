package practice;

public class PrintStars {
    public static void main(String[] args) {

        int a = 0;
        while (a <= 2) {
            a++;
            int b = 1;
            while (b <= a) {
                System.out.print("*");
                b++;
            }
            System.out.println();
        }

        int i =3;
        while (i >=0) {
            i--;
            int j= 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
        }

    }
}

