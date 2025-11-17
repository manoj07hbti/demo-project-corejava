package exception;

public class Voting {

    public void doVoting(int age) throws AgeNotEligibleException{
        if(age<18){
            //throw exception that Voter is not eligible
            throw new AgeNotEligibleException("Voter is not eligible for voting...");
        }else {
            System.out.println("Welcome to voting App...");
        }
    }

    public static void main(String[] args) {
        Voting obj= new Voting();
        try {
            obj.doVoting(17);
        } catch (AgeNotEligibleException e) {
            System.out.println("Exception "+e);
        }
    }
}
