package test_.test_16_june_commit;

public class Sum_Elements {

    //Problem: Write a Java program to calculate the sum of all elements in an integer array.

    // create method for sum of all elements
        public void sumElement(){
            int num []={1,2,3,4,5,27,50};
            int sum=0;

            for (int i=0;i< num.length;i++){
                sum+=num[i];

            }
            System.out.println("Sum of Given Element..."+sum);
        }

    public static void main(String[] args) {
        Sum_Elements obj = new Sum_Elements();
        obj.sumElement();
    }
}
