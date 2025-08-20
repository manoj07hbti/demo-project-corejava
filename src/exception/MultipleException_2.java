package exception;

public class MultipleException_2 {


    // Method for ArithmeticException
    public void handleArithmetic() {
        try {
            int result = 10 / 0; // risky
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in handleArithmetic(): " + e.getMessage());
        }
    }

    // Method for ArrayIndexOutOfBoundsException
    public void handleArray() {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]); // risky
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught in handleArray(): " + e.getMessage());
        }
    }

    // Method for NullPointerException
    public void handleNull() {
        String text = "ABC";
        try {
            System.out.println(text.length()); // risky
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in handleNull(): " + e.getMessage());
        }
    }
    public void finallyblock(){
        System.out.println("Finally block executed: Cleanup done ✅");
    }

    public static void main(String[] args) {
        MultipleException_2 obj = new MultipleException_2();
        // Call each method separately and handle exceptions

        obj.handleArithmetic();
        obj.handleArray();
        obj.handleNull();


    }

}
