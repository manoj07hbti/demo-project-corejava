package test_29_june;

public class DivisibleCheck2 {
    public boolean  isDivisibleBy9AndEven (int number){

        return (number % 9 ==0) && (number % 2 ==0);
    }

    public static void main(String[] args) {
        DivisibleCheck2 obj = new DivisibleCheck2();
        System.out.println("Numbers between 3 and 160 that are divisible by 9 and even:");
        for (int i = 3; i <= 160; i++) {
            if (obj.isDivisibleBy9AndEven(i)) {
                System.out.println(i);
            }
        }
    }
}
