package conditionals;

public class VotingEligibility {

    public static void main(String[] args) {

// if candidate is elligible then show message (Welcome to Voting System)

        int age=17;
        if (age>=18){
            System.out.println("welcome to voting system= "+age);
        }

// if not then "you are not elligible for Voting as your age is less than 18 Year"

        if (age<18){
            System.out.println("you are not elligible for Voting as your age is less than 18 Year= "+age);
        }

    }

}
