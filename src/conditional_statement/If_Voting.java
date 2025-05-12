package conditional_statement;

public class If_Voting {
    public static void main(String[] args) {

        int age=21;
        if(age>=18){
            System.out.println("Welcome to voting system: " +age);

            age=17;
        if(age<18){
            System.out.println("You are not elligible for voting as your age is less than 18 year: "+age);

        }
        }
    }
}
