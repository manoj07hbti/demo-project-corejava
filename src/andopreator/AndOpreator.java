package andopreator;

public class AndOpreator {
    public static void main(String[] args) {

//  Wrtie a code to check % of Student
//  1. percentage >=33 and <60  : Second division

       int percentage = 50;

        if (percentage >=33 && percentage <=60) {
            System.out.println("student got second division= "+percentage + "%");
        } else {
            System.out.println("student did not got second division"+percentage);
        }

        // 2. percentage >=60 and <75: First Division

        percentage =65;

        if (percentage >=60 && percentage <=75){
            System.out.println("student got first division= "+percentage +"%");
        }else {
            System.out.println("student did not get first division "+percentage);
        }

//        3. percentage >75 : Gold Madelist

        percentage=85;

        if (percentage <=90 && percentage >=75){
            System.out.println("student got Gold Madelist= "+percentage +"%");
        }else {
            System.out.println("student did not get Gold Madelist "+percentage);
        }

    }

}



