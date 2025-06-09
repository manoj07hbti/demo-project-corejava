package conditional_statement.conditional_statement_operator;

public class NestedIfDemo {
    public static void main(String[] args) {


    //Write a code to a person from delhi then he is eligible Delhi Voting.if age is above 18.

        String city="Agra";
        int age=18;

        if (age>=18){
            if (city=="Delhi"){
                System.out.println("This is Person is Eligible for Delhi Voting..");
            }else{
                System.out.println("This Person is not Eligible for Delhi Voting..");
            }
        }else{
            System.out.println("Age is not greater than 18...");
        }

    }
}
