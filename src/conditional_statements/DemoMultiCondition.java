package conditional_statements;

public class DemoMultiCondition {

    public static void main(String[] args) {

        //Write a code to check % of Student
        //  1. percentage >=33 and <60  : Second division
        //  2. percentage >=60 and <75: First Division
        //  3. percentage >75 : Gold Medalist

        int percentage=59;
        if (percentage>=33 && percentage<60){
            System.out.println("second division");
        }

        percentage=49;
        if (percentage>=60 && percentage<75){
            System.out.println("first division");
        }
        percentage=98;
        if (percentage>75) {
            System.out.println("gold medalist");
        }

        //Write a code to check Age group
        //  1. age >0 and <18  : Child
        //  2. age >=18  and <=40 : Young
        //  3. age>=60 : Old Age

        int age=32;
        if (age>0 && age<18){
            System.out.println("child");
        }if (age>=18 && age<=40){
            System.out.println("young");
            if (age>=60){
                System.out.println("old age");
            }
        }

        //Write a code to identify  number which is not divisible by 3.

        int number =10;
        if (number%3==1 || number%3==2) {
            System.out.println("number is not divisible by 3");
        }
        number=31;
        if (number%3==1 || number%3==2) {
            System.out.println("number is not divisible by 3");
        }
        number=24;
        if (number%3==1 || number%3==2) {
            System.out.println("number is not divisible by 3");
        }



    }


}
