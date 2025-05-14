package assignments;

public class VotingEligibilty {
    public static void main(String[] args) {

//write a code to check voting elligiblity .
//if candidate is elligible then show mesage "Welcome to Voting System"

        int age = 18;
        if (age>=18) {
            System.out.println("Welcome to voting system Sir/Mam");

        } else {
            System.out.println("you are not eligibile for Voting as your age is less than 18 Year");
        }

//if not then "you are not elligible for Voting as your age is less than 18 Year"

        if (age<18) {
            System.out.println("welcome to voting system");
        } else {
            System.out.println("you are not eligibile for Voting as your age is less than 18 Year");

        }

    }
}

