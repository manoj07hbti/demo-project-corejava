package test_8_june_commit;

public class Duplicate_Elements {

    public static void main(String[] args) {
        //Find Duplicate Elements in an Array

        int num[]= {1, 2, 3, 4, 2, 3, 5};

        for (int i=0;i< num.length;i++){
            for (int j=i+1;j<num.length;j++){  // Check With i
                if (num [i]==num[j] && i!=j ){
                    System.out.println("Duplicate Elements are ...."+num[j]);

                }
            }
        }
    }
}
