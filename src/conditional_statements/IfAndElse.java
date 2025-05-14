package conditional_statements;

public class IfAndElse {


    public static void main(String[] args) {
       //write a code to check voting eligibility .
        //if candidate is eligible then show message "Welcome to Voting System"
        //if not then "you are not eligible for Voting as your age is less than 18 Year

        int age=14;
        if (age>=18){
            System.out.println("welcome to voting system :"+ age);
        }else {
            System.out.println("you are not eligible for Voting system :"+age);
        }



         age=28;
        if (age>=18){
            System.out.println("welcome to voting system :"+ age);
        }else {
            System.out.println("you are not eligible for Voting system :"+age);
        }
    }

}
