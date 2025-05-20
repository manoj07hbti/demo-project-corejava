package practice;

public class StudentPercentage {
    public static void main(String[] args) {

        int percentage =80;
        if (percentage>=33 && percentage<=60){
            System.out.println("second division");
        } else if (percentage>=60 && percentage<75){
            System.out.println("first division");
        } else if (percentage>=75) {
            System.out.println("gold medalist");
        }else{
            System.out.println("failed...");
        }
    }

}
