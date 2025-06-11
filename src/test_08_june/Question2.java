package test_08_june;

public class Question2 {
    public static void main(String[] args) {

        //Sum of All Elements in an Array
       // Input: [1, 2,3,4,5]


        int [] num = {1,2,3,4,5};
        int sum = num [0];
        for(int i=1; i<5; i++){
          sum = sum + num [i];
        }
        System.out.println(sum);
    }
}
