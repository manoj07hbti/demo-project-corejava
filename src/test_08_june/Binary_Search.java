package test_08_june;
import java.util.Arrays;
public class Binary_Search {
    public static void main(String[] args) {
        //7. Binary search of finding element in array.


        int[] array = { 2 , 5 , 3 , 6 , 9 , 4 , 8 };
        Arrays.sort(array); //  array = { 2 , 3 , 4 , 5 , 6 , 8 };
        int input = 4;
        int low = array[0];
        int mid = array[array.length/2];
        int high = array[array.length-1];
        for ( int i=0 ; i<array.length ; i++ ){
            if (input==mid){
                break;
            }
            if(input>mid){
                mid = low;
            }else {
                high = mid;
            }
        }
        System.out.println(mid);
    }
}
