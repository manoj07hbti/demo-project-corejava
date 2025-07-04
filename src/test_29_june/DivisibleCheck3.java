package test_29_june;

public class DivisibleCheck3 {

    public boolean isDivisibleBy11AndEven(int num){
        return (num % 11 == 0) && (num % 2 == 0);
    }

    public static void main(String[] args) {
        DivisibleCheck3 obj = new DivisibleCheck3();
        System.out.println("Numbers between 7 and 190 that are divisible by 7 and even:");
        for (int i=8; i<=160; i++){
            if (obj.isDivisibleBy11AndEven(i)){
                System.out.println(i);
            }

        }
    }
}
