package conditional_statement_nestedif_operator;

public class PercentageCheck {

    public static void main(String[] args) {

/*        Wrtie a code to check % of Student
        1. percentage >=33 and <60  : Second division
        2. percentage >=60 and <75: First Division
        3. percentage >75 : Gold Madelist
*/
    // Using Nested If Condition here
        int percentage=80;

        if (percentage>=33 && percentage<=75){
            if (percentage<60){
                System.out.println("Second Divison");
            }else{
                System.out.println("First Division");
            }
        }else{
            System.out.println("Gold Medalist");
        }
    }
}
