package conditional_statement;

public class Assignment_Day12 {
    public static void main(String[] args) {


        // Q.1 Wrtie a code to check % of Student

        int marks=55;
        if(marks>=33 && marks<60){
            System.out.println("second division: "+marks);
        }else{
            System.out.println("Not second division: "+marks);
        }

        marks=65;
        if(marks>=60 && marks<75){
            System.out.println("First division: "+marks);
        }else{
            System.out.println("Not first division: " +marks);
        }

        marks=85;
        if(marks>=75 ){
            System.out.println("Gold medalist: " +marks);
        }else{
            System.out.println("Not a Gold medalist: " +marks);
        }

        // Q.2 Write a code to check Age group

        int age=15;
        if (age>0 && age<=18){
            System.out.println("child: " +age);
        }else{
            System.out.println("Not a child: " +age);
        }

        age=33;
        if(age>=18 && age<=40){
            System.out.println("Young: " +age);
        }else{
            System.out.println("Not young:" +age);
        }

        age=75;
        if(age>=60){
            System.out.println("Old age: "+age);
        } else {
            System.out.println("Not Old age: "+age);
        }

        // Q.3 Write a code to identify  number which is not divisible by 3

        int number=15;
        if(number>0 && number%3==0){
            System.out.println("Number is divisible by 3: "+number);
        }else{
            System.out.println("Not Old age: "+age);
        }

    }
}
