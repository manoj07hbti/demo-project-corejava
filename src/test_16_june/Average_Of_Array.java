package test_16_june;

public class Average_Of_Array {

    public static void main(String[] args) {

        int average[] = {5, 10, 15};
        int sum = 0;

        for (int i = 0; i < average.length; i++) {
            sum += average[i];
            }
        double result =(sum/ average.length);
        System.out.println("The average of all= "+result);
     }
}



