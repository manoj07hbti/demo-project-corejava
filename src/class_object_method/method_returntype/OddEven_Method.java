package class_object_method.method_returntype;


public class OddEven_Method {

    public String odd(int num){
            if (num%2 !=0){
                return "Odd Number";
            }else
                return "Even Number";

    }


    // write a  calculator code.


    // Method to perform addition and return the sum
    public int addition (int num1, int num2){
        return num1+num2;
    }

    // Method to perform addition and return difference
    public int subtraction (int num1, int num2){
        return num1-num2;
    }

    // Method to perform multiplication and return the profuct
    public int multiply (int num1, int num2){
        return num1*num2;
    }

    // Method to perform divide and return
    public double divide (int num1, int num2){
        return (double) num1/num2;
    }


    public static void main(String[] args) {

        // object for OddEven
        OddEven_Method checker= new  OddEven_Method();

        String result= checker.odd(36);
        System.out.println("Given Number is..."+result);

        // object for Calculator
        OddEven_Method calculator = new OddEven_Method();

        int output= calculator.addition(31,43);
        System.out.println("Addtion of two number..."+output);

        output= calculator.subtraction(31,43);
        System.out.println("difference between given two number..."+output);

        output= calculator.multiply(31,43);
        System.out.println("product of given two number..."+output);

        double output1= calculator.divide(97,43);
        System.out.println("Divisible of given two number..."+output1);


    }
}
