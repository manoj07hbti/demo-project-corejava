package test_18_may;

public class AgeGroup {
    public static void main(String[] args) {

// Write a code to check Age group
//  1. age >0 and <18  : Child

        int age= 12;
        if (age>0 && age<18){
            System.out.println("Child= "+age);
        }

// 2. age >=18  and <=40 : Young

        age= 25;
        if (age>=18 && age<=40){
            System.out.println("young= "+age);
        }

// //  3. age >=60 : Old Age

        age= 70;
        if (age>=60){
            System.out.println("Old Age= "+age);
        }

    }

}
