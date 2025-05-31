package array_practice;

public class Array_Height {

    public static void main(String[] args) {


        System.out.println("Printing Height along with Index");
        System.out.println("======================================");
        double height []= {1.4,15.2,45.3,32.4,3.5,5.3,3.4};

        //Using For Loop
        for (int i=0;i<6;i++){
            System.out.println("Using For Loop..."+height[i]);
        }

        //Using while Loop
        int j=0;
        System.out.println("===============================");
        System.out.println("*******************************");
        while(j<6){
            System.out.println("Using While Loop..."+height[j]);
            j++;
        }

        //Using do while
        int a=0;
        System.out.println("=====================================");
        System.out.println("=====================================");
        do {
            System.out.println("Print Height using do While Loop.."+height[a]);
            a++;
        }while (a<6);


        //Advance for Loop
        for (double hei: height){
            System.out.println("Using Advance for Loop..."+hei);
        }


    }
}
