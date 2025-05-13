package conditional_statement;

public class VotingEligibilityIfAndElse {

    public static void main(String[] args) {
        int age=19;

        if (age>18){
            System.out.println("Welcome to Voting System.... "+age);
        } else {
            System.out.println("You are not eligible for Voting as your age is less than 18 Year");
        }

    }
}
