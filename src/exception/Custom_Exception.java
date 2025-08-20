package exception;

public class Custom_Exception {

    public void myMethod(int age) throws MyCustomException {
        if (age<17){
            throw new MyCustomException("Age must be 18 or above to vote.");
        }else {
            System.out.println("You are eligible to vote!");
        }
    }

    public void valueCheck(int num) throws MyCustomException {
        if (num<0){
            throw new MyCustomException("Value is Negative!");
        }else {
            System.out.println("Given Value is more than Zero");
        }
    }


    public static void main(String[] args) {

        Custom_Exception obj = new Custom_Exception();
        try {
            obj.myMethod(18);
        } catch (MyCustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());;
        }

        try {
            obj.valueCheck(-1);
        } catch (MyCustomException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
