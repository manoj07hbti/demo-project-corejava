package test_18_may;

public class Test18 {

    public static void main(String[] args) {

        //write a code to check eligible voter in Pune

        String city="pune";
        int age =32;

        if (age>=18 && city=="pune"){
            System.out.println("person is eligible for voting in pune");
        }else {
            System.out.println("person is not eligible for voting in pune");
        }

        //Write a code to find percentage of given number example: 5% of 500.

        int number=500;
         double percentage=(number*5)/100;
        System.out.println("percentage =" + percentage);

        //write a code to check if any given number is  even or odd number.

        number=15;
        if (number%2==0){
            System.out.println("given number is even");
        }else{
            System.out.println("given number is odd");
        }

        number=22;
        if (number%2==0){
            System.out.println("given number is even");
        }else{
            System.out.println("given number is odd");
        }

        //write a code to check person nationality , if nationality is
        // India then check state should be Maharashtra
        // then print both Nationality and state and if person is from
        // different nation it should print that
        // as well in else part.

        String nationality="america";
        String state="maharastra";

        if (nationality=="india") {
            System.out.println("nation is india");
        if (state=="maharashtra")
            System.out.println("state is maharastra");
        }else {
            System.out.println("nation is not india");
        }

        //Wrtie a code to check % of Student
        //  1. percentage >=33 and <60  : Second division
        //  2. percentage >=60 and <75: First Division
        //  3. percentage >75 : Gold Madelist

         percentage=64;

        if (percentage>=33 && percentage<60) {
            System.out.println("second division");
        }if (percentage >= 60 && percentage < 75){
                System.out.println("first division");
        }if (percentage>75){
            System.out.println("gold medalist");
        }

        //Write a code to check Age group
        //  1. age >0 and <18  : Child
        //  2. age >=18  and <=40 : Young
        //  3. age >=60 : Old Age

         age=84;
        if (age>0 && age<18){
            System.out.println("child");
        }if (age>=18 && age<=40) {
            System.out.println("young");
        }if (age>=60){
            System.out.println("old age");
        }


        //Write a code to identify  number which is not divisible by 3.

         number =32;
        if (number%3==1 || number%3==2) {
            System.out.println("number is not divisible by 3");
        }
        number=21;
        if (number%3==1 || number%3==2) {
            System.out.println("number is not divisible by 3");
        }
        number=12;
        if (number%3==1 || number%3==2) {
            System.out.println("number is not divisible by 3");
        }



    }


}
