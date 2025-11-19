package exception;

public class Bank {
    public void bankAmount (int amount) throws LessAmountException{

        if (amount<5000){

            throw new LessAmountException("Amount is less than 5000, can't open bank account");
        }else{
            System.out.println("Welcome to ABC bank account");
        }
    }

    public static void main(String[] args) {
        Bank obj = new Bank();
        try {
            obj.bankAmount(4500);
        } catch (LessAmountException e) {
            System.out.println("Exception" + e);
        }
    }
}
