package test_08_June;

public class Fourth {
    /*
    4. Find the Second Largest Element
    Input: [12, 35, 1, 10, 34,1]
    Output:34
     */

    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr){
            if (num>first){
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        System.out.println(second);
    }
}
