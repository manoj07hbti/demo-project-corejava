package test_18_may;

public class Check_Age_Group {
    /*
    Write a code to check Age group
  1. age >0 and <18  : Child
  2. age >=18  and <=40 : Young
  3. age >=60 : Old Age
     */

    public static void main(String[] args) {
        int Age = 44;
        if (Age > 0 && Age < 18){
            System.out.println("Child");
        } else if (Age >= 18 && Age <= 40) {
            System.out.println("Young");
        } else if (Age > 40 && Age < 60) {
            System.out.println("Middle Age");
        } else if (Age >= 60) {
            System.out.println("Old");
        }
    }
}
