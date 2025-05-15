package assisgnment;

public class NestedIF {

    public static void main(String[] args) {

        int number=6;
        if (number>0){
            if (number%3==0){

                System.out.println("the number is divisible by 3..");
            }
            }else {
            System.out.println(" number is not greater then 0...");
        }

        number=8;
        if (number>0){

            if (number%6==0){
                System.out.println("the number is divisible by 6...");
            }else {
                System.out.println("this number is not divisible by 6....");
            }

        }else {

            System.out.println("number is not greater then 0...");
        }

        }

    }
