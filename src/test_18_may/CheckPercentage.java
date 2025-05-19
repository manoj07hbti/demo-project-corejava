package test_18_may;

public class CheckPercentage {

    public static void main(String[] args) {

/*        Wrtie a code to check % of Student
        1. percentage >=33 and <60  : Second division
        2. percentage >=60 and <75: First Division
        3. percentage >75 : Gold Madelist
*/
        // Using Nested If Condition here
        int percentage=45;

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
