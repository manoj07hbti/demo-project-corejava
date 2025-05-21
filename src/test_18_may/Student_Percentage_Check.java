package test_18_may;

public class Student_Percentage_Check {

   /*
   Wrtie a code to check % of Student
  1. percentage >=33 and <60  : Second division
  2. percentage >=60 and <75: First Division
  3. percentage >75 : Gold Madelist
  */


    public static void main(String[] args) {
        int Percentage = 23;
        if (Percentage >= 33 && Percentage < 60){
            System.out.println("Passed with Second Division.");
        } else if (Percentage >= 60 && Percentage < 75) {
            System.out.println("Passed with First Division.");
        } else if (Percentage >= 75 && Percentage <= 100) {
            System.out.println("Passed with Gold Madel.");
        } else if (Percentage > 100) {
            System.out.println("Invalid.");
        } else {
            System.out.println("Failed in exam.");
        }
    }
}
