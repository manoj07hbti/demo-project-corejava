package test_08_june;

public class SumOfElement {


    public static void main(String[] args) {



        //2. Sum of All Elements in an Array
        //Input: [1, 2, 3, 4, 5]

        int num[]={1,2,3,4,5};


        int n=0;
        int sum=0;
        while (n<5){

            sum+=num[n];
            n++;

        }
        System.out.println(sum);


    }

}
