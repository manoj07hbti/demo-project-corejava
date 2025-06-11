package test_08_June;

public class First {

    /*
    1. Find the Maximum Element in an Array
    Input: [1,3,5,2,4]
     */

    public static void main(String[] args) {
        int arr[] = {1,3,5,2,4};
        int res = arr[0];

        for(int i = 0; i<arr.length ;i++){
            if (arr[i] > res){
                res = arr[i];
            }
        }
        System.out.println("Maximum number is: "+res);
    }
}
