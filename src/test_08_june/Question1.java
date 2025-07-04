package test_08_june;

public class Question1 {
    public static void main(String[] args) {
       // 1. Find the Maximum Element in an Array
        //Input: [1,3,5,2,4]

        int [] num = {1, 3, 5, 2, 4};
        int max = num[0];
        for(int i=1; i<5; i++){
            if(num[i]>max){
                max=num[i];

            }
        }
        System.out.println("Max element " + max);
    }
}
