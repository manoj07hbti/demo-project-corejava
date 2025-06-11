package test_08_June;

import java.util.Arrays;
import java.util.Collections;

public class Third {

    /*
    3. Reverse an Array
    Input: [1, 2, 3, 4, 5]
    Output: [5,4,3,2,1]
     */

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}
