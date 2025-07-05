package test_18_may;

public class TestOne {

    public static void main(String[] args) {

        //write a code to check eligible voter in Pune ?

            String city="jammu";
            int age=22;

            if (city=="pune" && age>=18){

                System.out.println("person is eligible of voting in pune ");
            }else {
                System.out.println("person is not eligible for voting in pune");
            }

       //Write a code to find percentage of given number example: 5% of 500?

        int number=500;


            double output=(double) number*5/100;


        System.out.println("percentage of 500 is "+ output);

        //write a code to check if any given number is  even or odd number?

        number=20;
        if (number%2==0){
            System.out.println("this is a even number");
        }else {
            System.out.println("this is not even number");
        }

        number=17;

        if (number%2==0){
            System.out.println("this is not a odd number");
        }else{
            System.out.println("this is a odd number");
        }


        //write a code to check person nationality , if nationality is India then check state should be
        //Maharashtra then print both Nationality and state and if person is from different nation it
        //should print that as well in else part?



        String nation="India";
        String state="Maharashtra";

        if (nation=="India" && state=="Maharashtra"){

            System.out.println("the nationality of person is :"+ nation +" and state is :"+ state);

        }else {
            System.out.println("person is from different nation");
        }


        //Wrtie a code to check % of Student
        //  1. Percentage >=33 and <60  : Second division
        //  2. Percentage >=60 and <75: First Division
        //  3. Percentage 75: Gold Madelist

        int percentage=46;

        if (percentage>=33 && percentage<60){

            System.out.println("student has second division");
        }else {
            System.out.println("student was fail in there exam");
        }

        percentage=72;

        if (percentage>=60 && percentage<75){
            System.out.println("student has first division");
        }else {
            System.out.println("student was fail in there class");
        }

        percentage=82;

        if (percentage>=75){
            System.out.println("Gold madelist ");
        }else {
            System.out.println("Not a Glod madelsit ");
        }


        //Write a code to check Age group
        //  1. Age >0 and <18  : Child
        //  2. Age >=18  and <=40 : Young
        //  3. Age >=60 : Old Age

         age=16;

        if (age>0 && age<18){

            System.out.println("vishal is a child");
        }else {
            System.out.println("vishal is not a child");
        }

        age=42;

        if (age>=18 && age<40){

            System.out.println("visal is a young");
        }else {
            System.out.println("vishal is not a young boy");
        }

        age=72;

        if (age>60 ){

            System.out.println("He is a old person");
        }else {
            System.out.println("He is not a old person");
        }


        //Write a code to identify  number which is not divisible by 3.

        number=7;
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
