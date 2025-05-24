package conditional_statements;

public class NotOperator {
    public static void main(String[] args) {

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
