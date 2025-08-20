package exception;

public class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message); // pass message to Exception class
    }
}
