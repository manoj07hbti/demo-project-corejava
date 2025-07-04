package test_29_june;

public class DivisibleCheck4 {

        public boolean isDivisibleBy11AndEven(int num) {
            return (num % 11 == 0) && (num % 2 == 0);
        }

        public static void main(String[] args) {
            DivisibleCheck4 obj = new DivisibleCheck4();
            System.out.println("Numbers between 7 and 190 that are divisible by  and even:");
            for (int i =180; i >=1; i--) {
                if (obj.isDivisibleBy11AndEven(i)) {
                    System.out.println(i);
                }

            }
        }
}
