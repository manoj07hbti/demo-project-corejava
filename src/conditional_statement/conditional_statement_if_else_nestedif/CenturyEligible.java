package conditional_statement.conditional_statement_if_else_nestedif;

public class CenturyEligible {

    public static void main(String[] args) {

        int score=99;
//check century of a batsman//
        if (score==100){
            System.out.println("Century of a Batsman..: "+score);
        }

        //check not century of a batsman
        if (score!=100){
            System.out.println("Century is not of a Batsman..: "+score);
        }
    }
}
