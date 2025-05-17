package conditional_statement;

public class CheckAgeGroup {

    public static void main(String[] args) {

  /*   Write a code to check Age group
  1. age >0 and <18  : Child
  2. age >=18  and <=40 : Young
  3. age >=60 : Old Age*/

        int age=60;
// Using Conditional Statement

        if (age>0 && age<18){
            System.out.println("Child");
        }else{
            if (age>=18 && age<=40){
                System.out.println("Young..");
            }else{
                if (age>=60){
                    System.out.println("Old Age");
                }
            }
        }

    }
}
