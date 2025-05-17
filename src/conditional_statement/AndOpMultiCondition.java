package conditional_statement;

public class AndOpMultiCondition {

    public static void main(String[] args) {

        //SYNTAX : &&
        //if(condition1 && condition2)

        //1. TRUE & TRUE = TRUE    =  1*1=1
        //2. TRUE & FALSE = FALSE  =  1*0=0
        //3. FALSE & TRUE = FALSE  =  0*1=0
        //4. FALSE & FALSE = FALSE =  O*0=O

        //TRUE = 1 FALSE = 0

        //Write a code to check Age group
        //  1. age >0 and <18  : Child
        //  2. age >=18  and <=40 : Young
        //  3. age >=60 : Old Age

        int age=16;

        if (age>0 && age<18){

            System.out.println("Aman is a child");
        }else {
            System.out.println("Aman is not a child");
        }

        age=42;

        if (age>=18 && age<40){

            System.out.println("Aman is a child");
        }else {
            System.out.println("Aman is a young boy");
        }

        age=72;

        if (age>74 && age<77){

            System.out.println("He is not a old person");
        }else {
            System.out.println("He is a old person");
        }

        age=34;

        if (age<28 && age>23){

            System.out.println("True");
        }else {
            System.out.println("False");
        }


        //Write a code to identify  number which is not divisible by 3.

        int number=7;
        if (number>0){

            if (number%3==0){
                System.out.println("the number is divisible by 3");
            }else {
                System.out.println("the number is not divisible b 3");
            }

        }else {
            System.out.println(" number is not greater then 0");
        }

    }
}
