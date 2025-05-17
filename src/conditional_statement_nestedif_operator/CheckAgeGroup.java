package conditional_statement_nestedif_operator;

public class CheckAgeGroup {

    public static void main(String[] args) {

  /*   Write a code to check Age group
  1. age >0 and <18  : Child
  2. age >=18  and <=40 : Young
  3. age >=60 : Old Age*/

        int age=30;

        if (age>0 && age<=40){
            if (age>=18){
                System.out.println("This age is under Young Generation Category..."+age);
            }else {
                System.out.println("This age is under Child Category..."+age);
            }
        }else{
            System.out.println("This age is Under Old Age Category..."+age);
        }





        // Using only If and else Conditional Statement

/*        if (age>0 && age<18){
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
*/


    }
}
