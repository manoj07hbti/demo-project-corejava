package method_return_type;

public class Check_Factorial {

    public int findFactorial(int number) {

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }


    public static void main(String[] args) {
        Check_Factorial obj=new Check_Factorial();

        int output =obj.findFactorial(3);
        System.out.println(output);

        output =obj.findFactorial(5);
        System.out.println(output);

        output =obj.findFactorial(8);
        System.out.println(output);
    }
}
