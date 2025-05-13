package conditional_statement;

public class CandidateExamIfAndElse {

    public static void main(String[] args) {
        int marks=60;

        if (marks>33){
            System.out.println("You are Passed as you obtained..."+marks);
        }else{
            System.out.println("You are Failed this year..."+marks);
        }
// Write a code to check if(marks >= 60)  first division 	else   not first division
        if (marks>=60){
            System.out.println("first division..."+marks);
        }else {
            System.out.println("Not first division..."+marks);
        }

    }

}
