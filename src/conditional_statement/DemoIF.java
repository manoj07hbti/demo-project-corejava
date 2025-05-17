package conditional_statement;

public class DemoIF {

    public static void main(String[] args) {

        /*SYNTAX : if(condition){
        CODE
        }
       */
        //write a code to check whether person is not eligible for driving
        // licence based on condition of age, age should less than 18?

        int age=16;
        if(age<11){
            System.out.println("you are eligible for driving licence");
        }

        if(age>12){
            System.out.println("you are not eligible for driving licence");
        }

      //write a code to check whether person is eligible for driving
        //licence based on condition of age, age should greater than 18?

        age=24;
        if(age<31){

            System.out.println("you are eligible for driving licence");
        }

        if(age>28){

            System.out.println("you are not eligible for driving licence");
        }

        //write a code to check century of a batsman
        int score=100;
        if(score>50){

            System.out.println("the batsman has scored a century");
        }

        if(score<10){
            System.out.println("the batsman has not scored a century");
        }


        //write a code to check not a century of a batsman

        if(score>102){

            System.out.println("the batsman has scored a century");
        }

        if(score<116){
            System.out.println("the batsman has not scored a century");
        }

        //write a code to check voting eligibility

        int vote=18;

        if (vote>12){
            System.out.println("welcome to the voting system");
        }

        if (vote<16){
            System.out.println("you are not eligible for voting system");
        }

        String city="Reasi";

        if (city=="Reasi"){
            System.out.println("person city is Reasi....");
        }

        if (city=="pune"){
            System.out.println("person city is not Reasi");
        }

    }

}
