package test_08_june;

public class Duplicate_Element_In_Array {
    public static void main(String[] args) {

        //6. Find Duplicate Elements in an Array
        //Input: [1, 2, 3, 4, 2, 3, 5]
        //Output: [2, 3]

        int[] arr = {1, 2, 3, 4, 2, 3, 5};
        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
