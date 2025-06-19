package test_08_june;

public class Finding_SecondLargestNumber {
    public static void main(String[] args) {

        //4. Find the Second Largest Element
        //Input: [12, 35, 1, 10, 34, 1]
        int[] arr = {12, 35, 1, 10, 34, 1};
        int first = 0;
        int second = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {

                second = first;   // update second before first
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }System.out.println("The second largest element is: " + second);
    }
}
