package conditional_statement;

public class CandidateExam {

    public static void main(String[] args) {
        String name="Neeshu";
        int marks=32;

//if candidate has marks greater than 33 then it will print cleared the exam.
        if (marks>=33){
            System.out.println(name+"'s Exam Cleared. he got "+marks +" Marks");
        }

        //if candidate has marks less than 33 then it will print NOT cleared the exam.
        if (marks<33){
            System.out.println(name+"'s Exam not Cleared. he got "+marks +" Marks");
        }


    }
}
