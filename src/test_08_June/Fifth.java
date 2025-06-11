package test_08_June;

public class Fifth {
    /*
    Count the Number of Even and Odd Elements
    Input: [1, 2, 3, 4, 5, 6]
    Output:Even:3,Odd:3
     */

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int even = 0;
        int odd = 0;

        for (int i : arr){
            if (i%2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("Even: "+even+", Odd: "+odd);
    }
}
