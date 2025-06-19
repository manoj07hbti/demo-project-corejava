package Methods.ReturnType;

import sun.nio.ch.SelectorImpl;

public class First {

    //To Check Even Odd

    public String even_odd(int number){
        String res = "";
        if (number % 2 ==0){
            res = number+" even";
        }
        else {
            res = number+" odd";
        }
        return res;
    }


    // To Check Prime or not

    public String prime_Check(int num){
        boolean Check_prime = true;
        String Res = "";

        if (num <=1){
            Check_prime = false;
        } else {
            for (int i = 2; i * i <= num; i++){
                if (num % i == 0){
                    Check_prime = false;
                    break;
                }
            }
        }

        if (Check_prime){
            Res = num+" Prime";
        }
        else {
            Res = num+" Not Prime";
        }

        return Res;
    }

    // write a code to find factorial

    public int Factorial(int num){
        int result = 1;
        for (int i = num; i>= 1; i--) {
            result = result * i;
        }

        return result;
    }

    // write calculator

    public double calculator(int a, int b, int choice){
        double result = 1;

        if (choice == 1){
            result = a+b;
        } else if (choice == 2) {
            result = a-b;
        } else if (choice == 3) {
            result = a*b;
        } else if (choice == 4) {
            result = a/b;
        }

        return result;
    }

    public String Check_Division(int TotalMarks_Percentage){
        String Division = "";

        if (TotalMarks_Percentage >= 60 && TotalMarks_Percentage <80){
            Division = "First Division";
        } else if (TotalMarks_Percentage >=80 && TotalMarks_Percentage <90) {
            Division = "Excellent Division";
        } else if (TotalMarks_Percentage >=90 && TotalMarks_Percentage <=100) {
            Division = "Gold Medalist";
        }else {
            Division = "Second Division";
        }

        return Division;
    }



    public static void main(String[] args) {
        First obj = new First();

        String output = obj.even_odd(12);
        System.out.println(output);

        String Out = obj.prime_Check(7);
        System.out.println(Out);

        int Res = obj.Factorial(5);
        System.out.println("Factorial: "+Res);

        double Result = obj.calculator(6,3,3);
        System.out.println("Result: "+Result);

        String Division = obj.Check_Division(90);
        System.out.println(Division);
    }
}
