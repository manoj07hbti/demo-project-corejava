package exception;

public class Mutiple_Excetion {


public void performOperations() {


        try {
            // This might throw an ArithmeticException (division by zero)
            int result = 10 / 0;
            System.out.println("Result: " + result);


            // This might throw an ArrayIndexOutOfBoundsException
            int[] numbers = {1, 2, 3};
            System.out.println("Element at index 5: " + numbers[4]);

        }catch (ArithmeticException e){
            System.out.println("Error: Division by zero occurred. " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index out of bounds. " + e.getMessage());
        }catch (Exception e){  // Generic catch-all for other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Operations attempt completed. This block always executes.");
        }
    }

    public static void main(String[] args) {
        Mutiple_Excetion obj = new Mutiple_Excetion();
        obj.performOperations();
    }


}
