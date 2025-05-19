package test_18_may;

public class StudentPercentage {
    public static void main(String[] args) {

// Wrtie a code to check % of Student
//  1. percentage >=33 and <60  : Second division

        int percentage= 50;
        if (percentage>=33 && percentage<60){
            System.out.println("Second Division= "+percentage+"%");
        }
// 2. percentage >=60 and <75: First Division

        percentage= 70;
        if (percentage>=60&& percentage<75){
            System.out.println("First Division= "+percentage+"%");
        }

// 3. percentage >75 : Gold Madelist

        percentage= 85;
        if (percentage>75){
            System.out.println("Gold Medalist= "+percentage+"%");
        }

    }
}
