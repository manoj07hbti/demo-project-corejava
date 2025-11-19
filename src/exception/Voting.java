package exception;

public class Voting {
    public void doVoting (int age)throws AgeNotEligibleException{

        if(age<18){
            // throw exception that voter is not eligible
            throw new AgeNotEligibleException("Voter is not Eligible for voting...");
        }else{
            System.out.println("Welcome to Voting App.....");

            //note It is called checked exception bcz it tells you exception at compile time
        }

    }

    public static void main(String[] args) {
        Voting obj = new Voting();
        try {
            obj.doVoting(17);
        } catch (AgeNotEligibleException e) {
            System.out.println("Exception" +e);
        }
    }
}
