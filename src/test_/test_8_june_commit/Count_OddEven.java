package test_.test_8_june_commit;

public class Count_OddEven {

    public static void main(String[] args) {
        // 5. Count the Number of Even and Odd Elements
        int b[]= {1, 2, 3, 4,6,6,4,2, 5, 6};
        int evenCount=0;
        int oddCount=0;

        for (int number:b){
            if (number % 2 ==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Count of Even number in the Array..... "+evenCount);
        System.out.println("Count of Even number in the Array..... "+oddCount);


    }
}
