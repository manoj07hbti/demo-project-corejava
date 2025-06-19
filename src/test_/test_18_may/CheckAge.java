package test_.test_18_may;

public class CheckAge {

    public static void main(String[] args) {

        /*   Write a code to check Age group
        1. age >0 and <18  : Child
        2. age >=18  and <=40 : Young
        3. age >=60 : Old Age*/
        int age = 17;

        if(age>0 && age<=40){
            if (age<=18){
                System.out.println("This age is under Child Category..."+age);
            }else {
                System.out.println("This age is under Young Category..."+age);
            }
        }else{
            System.out.println("This age is under Old age Category..."+age);
        }

   /*     if (age >=0 && age<60) {
            if (age < 18) {
                System.out.println("This age is under Child Category..."+age);
            } else if (age >= 18 && age <= 40) {
                System.out.println("This age is under Young Category..."+age);
            } else if (age > 40 && age < 60) {
                System.out.println("Middle-aged"); // Optional (not in your requirements)
            } else if (age >= 60) {
                System.out.println("This age is under old Age.."+age);
            }
        }*/

    }
}

