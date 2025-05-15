package conditional_statements;

public class AndOpMultiCondition {

    public static void main(String[] args) {

        //Write a code to check eligible voting candidates in Delhi
        int age=19;
        String city="Delhi";

        //1.   TRUE  && TRUE = TRUE
        if(age>=18 && city=="Delhi"){
            System.out.println("Eligible for Voting in Delhi...");
        }else {
            System.out.println("Not Eligible for Voting in Delhi...");
        }

        // 2.   TRUE & FALSE= FALSE
        city="Pune";
        if(age>=18 && city=="Delhi"){
            System.out.println("Eligible for Voting in Delhi...");
        }else {
            System.out.println("Not Eligible for Voting in Delhi...");
        }

        //3.   FALSE & TRUE= FALSE
         city="Delhi";
          age=17;
        if(age>=18 && city=="Delhi"){
            System.out.println("Eligible for Voting in Delhi...");
        }else {
            System.out.println("Not Eligible for Voting in Delhi...");
        }

        //4.   FALSE & FALSE= FALSE   0*0= 0
        age=12;
        city="Mumbai";
        if(age>=18 && city=="Delhi"){
            System.out.println("Eligible for Voting in Delhi...");
        }else {
            System.out.println("Not Eligible for Voting in Delhi...");
        }

    }
}
