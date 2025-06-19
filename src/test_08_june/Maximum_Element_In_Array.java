package test_08_june;

public class Maximum_Element_In_Array {
    public static void main(String[] args) {


        // 1. Finding the Maximum Element in an Array

                int[] elements = {1, 2, 3, 4};
                int max = elements[2];

                for (int i = 1; i < elements.length; i++) {
                    if (elements[i] > max) {  // If current element is greater than max
                        max = elements[i]; // update max
                    }
                } System.out.println("Maximum element is: " + max);
            }
        }
