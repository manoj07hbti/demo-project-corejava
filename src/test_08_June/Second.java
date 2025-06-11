package test_08_June;

public class Second {
    /*
    2. Sum of All Elements in an Array
    Input: [1, 2,3,4,5]
     */

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int res = 0;
        for (int i = 0; i<5; i++){
            res += arr[i];
        }
        System.out.println(res);
    }
}
