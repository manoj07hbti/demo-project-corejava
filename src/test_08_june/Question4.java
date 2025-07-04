package test_08_june;

public class Question4 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        int temp;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i]<arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//        }
//        System.out.println("Second Largest number is " + arr[1]);

        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if (arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }
        }
        System.out.println("Print second largest " + secondLargest);
    }
}
