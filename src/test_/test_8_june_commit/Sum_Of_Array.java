package test_.test_8_june_commit;

public class Sum_Of_Array {

    public static void main(String[] args) {

        int a[]={7,4,3,4,2,6,1};
        int sum =0;

        // Using For Loop
       /* for (int i=0;i<a.length;i++){
            sum+=a[i];
        }

        System.out.println("Sum of Given Array is ..."+sum);*/

        //Advance For loop
        for (int sumArray: a){
            sum+=sumArray;
        }
        System.out.println("Sum Of Element Using Advance for Loop.."+sum);



    }




}
