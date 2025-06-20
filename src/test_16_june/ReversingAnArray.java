package test_16_june;

public class ReversingAnArray
{
    public void reverseArray()
    {
        int arr [] = {1,2,3,4};

        for (int i = arr.length-1; i >= 0; i--) // using '.length' property to get all elements inside the array...
        {
            System.out.println("Reversing array: "+arr[i]);
        }
    }

    public static void main(String[] args)
    {
        ReversingAnArray reversingAnArray = new ReversingAnArray();
        reversingAnArray.reverseArray();
    }
}
