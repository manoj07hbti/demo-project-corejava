package test_.test_16_june_commit;

public class Reverse_Array_ {


    public void reverseArray( int [] arr){

            for (int i= arr.length-1;i>=0;i--){
                System.out.print(arr[i]+", ");
            }

    }

    public static void main(String[] args) {
        int [] arr ={1,24,7,8,9,90};

        Reverse_Array_ obj = new Reverse_Array_();
        obj.reverseArray(arr);


    }
}

