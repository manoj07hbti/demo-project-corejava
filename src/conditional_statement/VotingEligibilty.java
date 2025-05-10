package conditional_statement;

public class VotingEligibilty {
    public static void main(String[] args) {

        int age=17;

        if (age>=18){
            System.out.println("The person is Eligible for Voting..: "+age);
        }

        if (age<18){
            System.out.println("The person is not Eligible for Voting..: "+age);
        }
    }
}
