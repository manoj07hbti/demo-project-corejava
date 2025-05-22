package conditional_statement_if_else_nestedif;

public class OfficeAttendance {

    public static void main(String[] args) {
        //If a person punch after 9 message showing "You are Absent today"
        double time=9.3;

        if (time<=9){
            System.out.println("You are Present Today");
        }

        if (time>9){
            System.out.println("You are Absent Today");
        }

    }
}
