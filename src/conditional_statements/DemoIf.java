package conditional_statements;

public class DemoIf {
    public static void main(String[] args) {
        // write a code to check whether person is eligible
        // for driving licence based on condition of age, age should greater than 18.

        /*SYNTAX if (condition){
                  CODE
                  }

         */
        int age = 25;
        if (age > 18) {
            System.out.println("person is eligible of driving licence.....");
              }
        age=16;
        if(age>18){
            System.out.println("person is eligible of driving licence.....");
              }



        // write a code to check whether person is not eligible
        // for driving licence based on condition of age, age should less than 18.

         age=15;
        if (age<18){
            System.out.println("person is not eligible for driving licence....");
             }
        age=32;
        if(age<18){
            System.out.println("person is not eligible of driving licence.....");
        }

        //write a code to check century of a batsman

        int score=154;
        if(score>=100){
            System.out.println("this player has score a century....");
        }
        score=74;
        if(score>100){
            System.out.println("this player has score a century ...");
        }
        //write a code to check not a century of a batsman
        score=84;
        if(score<100){
            System.out.println("this player has not score a century....");
        }

        //write a code to identify candidate which are from pune based on city value.

        String city="mumbai";
        if (city=="pune"){
            System.out.println("person city is pune...");
        }
        //write a code to check voting elligiblity
        age=32;
        if (age>=18){
            System.out.println("welcome to voting system..");
        }
        age=15;
        if (age<18){
            System.out.println("you are not elligible for voting as your age is less then 18 years...");
        }


    }

}
