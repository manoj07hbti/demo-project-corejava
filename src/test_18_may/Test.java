package test_18_may;

public class Test {
    public static void main(String[] args) {


        //write a code to check eligible voter in Pune

        int age=20;
        if(age>=18){
            System.out.println("Person is eligible for voting: "+age);
        }else{
            System.out.println("Person is not for eligible:");
        }

        //Write a code to find percentage of given number example: 5% of 500

        int number=500;
        double percentage=number/100*5;
        System.out.println("5 percent of 500 is: " +percentage);

        //write a code to check if any given number is  even or odd number

        number=84;
        if(number%2==0){
            System.out.println("number is even: "+number);
        }else{
            System.out.println("number is odd: " +number);
        }


        //write a code to check person nationality , if nationality is India then check state
        // should be Maharashtra then print both Nationality and state and
        // if person is from different nation it should print that as well in else part.

        String country="Indian";
        String state="maharashtra";
        if(country=="Indian"){
            if(state=="maharashtra"){
                System.out.println("Nationality: " +country + " state: " +state);
            }else{
                System.out.println("Nationality: " +country + " state: " +state);
            }
        }


        //Wrtie a code to check % of Student
        //  1. percentage >=33 and <60  : Second division
        //  2. percentage >=60 and <75: First Division
        //  3. percentage >75 : Gold Madelist

        int score=66;
        if(score>=33){
            if(score<=60){
                System.out.println("Second division: "+score);
            }else {
                System.out.println("not second division: "+score);
            }
            if(score>=60 && score<=75){
                System.out.println("First division: "+score);
            }else{
                System.out.println("Not first division: "+score);
            }

            score=77;
            if (score>=75){
                System.out.println("Gold medalist: "+score);
            }else{
                System.out.println("Not a Gold medalist: "+score);
            }
        }


        //Write a code to check Age group
        //  1. age >0 and <18  : Child
        //  2. age >=18  and <=40 : Young
        //  3. age >=60 : Old Age

         age=12;
        if(age>0 && age<=18){
            System.out.println("Child: "+age);
        }else{
            System.out.println("Not a child: "+age);
        }

        age=22;
        if(age>=18 && age<=40){
            System.out.println("Young: "+age);
        }else{
            System.out.println("Not young: "+age);
        }

        age=66;
        if(age>=60){
            System.out.println("Old age: "+age);
        }else{
            System.out.println("Not a old age: "+age);
        }

        //Write a code to identify  number which is not divisible by 3.

        number=19;
        if(!(number%3==0)){
            System.out.println("Not divisible by 3: "+number);
        }else{
            System.out.println("Divisible by 3: "+number);
        }
    }
}
