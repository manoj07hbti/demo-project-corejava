package test_16_june;

public class Sum_Of_All_Elements {
    public static void main(String[] args) {

        int elements[]={1,2,3,4,5};
        int sum=0;

        for (int i=0; i< elements.length; i++){
            sum +=elements[i];
        }
        System.out.println("sum of all elements= "+sum);
    }

}
