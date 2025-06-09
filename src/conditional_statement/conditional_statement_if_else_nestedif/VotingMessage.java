package conditional_statement.conditional_statement_if_else_nestedif;

public class VotingMessage {
    public static void main(String[] args) {

        //eligible then show message "Welcome to Voting System"
        int age=17;
        if (age>=18){
            System.out.println("Welcome to Voting System");
        }

        if (age<18){
            System.out.println("you are not elligible for Voting as your age is less than 18 Year");
        }

    }
}
