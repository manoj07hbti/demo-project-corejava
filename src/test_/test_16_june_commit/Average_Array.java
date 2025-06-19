package test_.test_16_june_commit;

public class Average_Array {

    //Problem: Write a Java method to calculate the average (mean) of array elements.

    public void averageCalcu(int [] num){

        int length = num.length;
        int sum =0;

        for (int i=0;i<length;i++){
            sum+=num[i];
        }
        float average = sum /length;
        System.out.println(" Average of element of array :"+ average);

    }

    public static void main(String[] args) {

        int [] num={1,14,15,26,45};
        Average_Array obj = new Average_Array();
        obj.averageCalcu(num);
    }




}
