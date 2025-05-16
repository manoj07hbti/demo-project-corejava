package andopreator;

public class OrOpreator {

    public static void main(String[] args) {

// Write a code to check Age group
//  1. age >0 and <18  : Child

        int age= 0;
            age= 18;

            if (age>=0 || age<=18){
                System.out.println("0 to 18 age people count in child");
            }else{
                System.out.println("0 to 18 age people count in young");
            }

// 2. age >=18  and <=40 : Young

        age=18;
        age=40;

        if (age>=18 || age<=40){
            System.out.println("18 to 40 age people count in young");
        }else{
            System.out.println("18 to 40 age people count in adult");
        }

// 3. age >=60 : Old Age

        age=60;
        age=80;

        if (age>=60 || age<=80){
            System.out.println("60 to 80 age people count in old age ");
        }else{
            System.out.println("60 to 80 age people count in old people");
        }





    }

}
