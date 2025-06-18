package test_8_june_commit;

public class Reverse_Array {

    // Write a code to print reverse of  given Array.

    public static void main(String[] args) {

        int seq[] ={1,2,3,5,6,7,8,9};

        // Using for Loop with Decresing operator to print reverse
        for (int i= seq.length-1;i>=0;i--){
            System.out.print(seq[i]+", ");
        }
    }

}
