package test_16_june_commit;

public class OddEven_Count {

    //Problem: Write a Java program to count the number of even and odd numbers in an array.

    public void oddEven(int [] num){

        int evenCount = 0;
        int oddCount =0;

            for (int count:num){
                if (count%2 ==0){
                    evenCount++;
                }else {
                    oddCount++;
                }
            }
        System.out.println("Count of Even in Given Array..."+evenCount);
        System.out.println("Count of Odd in Given Array..."+oddCount);

    }

    public static void main(String[] args) {
        int[] num={10,23,46,78,9,6,97,42,56,1,87,91,71};

        OddEven_Count obj = new OddEven_Count();
        obj.oddEven(num);

    }

}
