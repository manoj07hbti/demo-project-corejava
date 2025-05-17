package conditional_statements;

public class NotOperator {

    public static void main(String[] args) {

        // we need to check if a person is eligible for vote based on age
        int age=17;

        if(!(age<18)){
            System.out.println("Person is eligible for Voting...");
        }else {
            System.out.println("Person is not eligible for Voting...");
        }

        //number should not be zero
     age=0;
        if(!(age==0)){
            System.out.println("Age is not Zero...");
        }else {
            System.out.println("Age is Zero...");

        }

    }
}
