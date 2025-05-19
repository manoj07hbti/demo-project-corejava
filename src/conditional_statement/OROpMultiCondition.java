package conditional_statement;

public class OROpMultiCondition {

    public static void main(String[] args) {

        //SYNTAX : OR Operator || Optional

        //if(condition1 || condition2)

        //1. TRUE || TRUE = TRUE 1+1=1
        //2. TRUE || FALSE = TRUE 1+0= 1
        //3. FALSE || TRUE = TRUE 0+1=1
        //4. FALSE || FALSE = FALSE 0+0=0

        //Wrtie a code to check % of Student
        //  1. percentage >=33 and <60  : Second division
        //  2. percentage >=60 and <75: First Division
        //  3. percentage 75: Gold Madelist

        int percentage=46;

        if (percentage>=33 || percentage<60){

            System.out.println("student has second division");
        }else {
            System.out.println("student was fail in there exam");
        }

        percentage=79;

        if (percentage>=60 || percentage<75){
            System.out.println("student has first division");
        }else {
            System.out.println("student was fail in there class");
        }

        percentage=82;

        if (percentage>=83 || percentage<=80){
            System.out.println("gold madelist is available");
        }else {
            System.out.println("glod madelsit is not available");
        }

        percentage=76;

        if (percentage>=77 || percentage<80){
            System.out.println("student has first division");
        }else {
            System.out.println("student was fail in there class");
        }


    }
}
