package class_object_method.method_returntype;

public class Check_Division {

    /*        Wrtie a code to check % of Student
        1. percentage >=33 and <60  : Second division
        2. percentage >=60 and <75: First Division
        3. percentage >75 : Gold Madelist
*/

    public String checkDivision(int percentage){

        if (percentage<33){
            return "Fail";
        }

        if (percentage>=33 && percentage<75 ){
            if (percentage<60){
                return "Second Division";
            }else {
                return "First Division";
            }
        }else {
            return "Gold Medalist";

        }


    }

    public static void main(String[] args) {


        Check_Division check = new Check_Division();

        String percentage = check.checkDivision(32);
        System.out.println("Division of Student .."+percentage);

    }

}
