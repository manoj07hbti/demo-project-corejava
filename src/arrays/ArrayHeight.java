package arrays;

public class ArrayHeight {

    public static void main(String[] args) {

        double height[]={5.6,4.3,6.1,3.5,6.8};

        for (int i = 0; i < 5; i++) {
            System.out.println("printing height...: "+height[i]);
        }

        //dowhileloop

        int a=0;
        do {
            System.out.println("printing height using dowhile....: "+height[a]);
            a++;
        }while (a<5);

        //whileloop

        int s=0;
        while (s<5){
            System.out.println("printing height using whileloop....: "+height[s]);
            s++;
        }

        //advancedloop

        for (double human: height) {
            System.out.println("printing height using advanced loop....: "+human);
        }
    }
}
