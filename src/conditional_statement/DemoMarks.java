package conditional_statement;

public class DemoMarks {

    public static void main(String[] args) {


        //if and else
        //	if(marks >= 60)  first division 	else   not first division
        //	 if(marks< 33) : not cleared exam  else: cleared exam

        int marks=31;
     if (marks>=60){
            System.out.println("first division ");
        }else
            System.out.println("not first division");

        if (marks<33){
            System.out.println("not cleared exam");
        }else {
            System.out.println("cleared exam");
        }


    }
}
