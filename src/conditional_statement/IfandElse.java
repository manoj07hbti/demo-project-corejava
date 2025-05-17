package conditional_statement;

public class IfandElse {

    public static void main(String[] args) {

        int number=18;

        if (number>12){

            System.out.println("welcome to voting system");
        }else {

            System.out.println("you are not eligible for voting system");
        }

        if (number<=12){

            System.out.println("welcome to voting system");
        }else {

            System.out.println("you are not eligible for voting system");
        }

        int marks=74;
        if (marks>=60){

            System.out.println("candidate get first division");
        }else {

            System.out.println("not first division");
        }

        marks=33;

        if (marks<23){

            System.out.println("not clear the exam");
        }else {
            System.out.println("clear the exam");
        }


    }
}
