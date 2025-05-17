package conditional_statement_nestedif_operator;

public class AndOperatorDay2 {

    public static void main(String[] args) {

        /* Write a code to check % of Student
        1. percentage >=33 and <60  : Second division
        2. percentage >=60 and <75: First Division
        3. percentage >75 : Gold Madalist*/

        int percentage=55;

        if (percentage>=33 && percentage<75){
            System.out.println("Second division... "+percentage);
        }else{
            if (percentage>=60 && percentage<75){
                System.out.println("First Division.."+percentage);
            }else{
                if (percentage>75){
                    System.out.println("Gold Medalist");
                }
            }
        }

    }
}
