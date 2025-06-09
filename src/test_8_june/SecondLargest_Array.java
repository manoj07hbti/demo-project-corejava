package test_8_june;

public class SecondLargest_Array {

    public static void main(String[] args) {
        //4. Find the Second Largest Element
        int value[]= {12, 35, 1, 10, 34, 1};
        int temp;

        for (int i=0;i< value.length;i++){
            for (int j=i+1;j< value.length;j++){
                if (value[i]<value[j]){

                       //Swapping Value
                        temp=value[i];
                        value[i]=value[j];
                        value[j]=temp;
                }
            }
        }
        System.out.println("Second Largest Element.."+value[1]);
    }
}
