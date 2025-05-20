package conditional_statement_nestedif_operator;

import conditional_statement.CandidateExamIfAndElse;

public class NotOperator {

    public static void main(String[] args) {
    //Write a code to check Country should not be India.
     String countryName="India";
        if (!(countryName=="India")){
            System.out.println("Country is.."+countryName);
        }else{
            System.out.println("Country is not.."+countryName);
        }
    }
}
