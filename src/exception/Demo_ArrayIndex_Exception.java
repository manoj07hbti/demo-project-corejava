package exception;

public class Demo_ArrayIndex_Exception {

    //handling ArrayIndexOutOfBoundsException
    public  void Array(){

        int [] array= {1,3,5,6,8};
        System.out.println("Before Display");
        try {
            System.out.println(array[7]); //Accessing invalid index (index 5 doesn't exist)
        } catch (Exception e) {
            System.out.println("Invalid array index accessed!.."+e); //  // Handles case when index is out of range
        }
        System.out.println("After Display");// After Exception printing this Statement

    }

    public static void main(String[] args) {
        Demo_ArrayIndex_Exception obj= new Demo_ArrayIndex_Exception();
        obj.Array();
    }
}
