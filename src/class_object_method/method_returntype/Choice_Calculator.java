package class_object_method.method_returntype;

import javax.sound.midi.Soundbank;

public class Choice_Calculator {


    //3- Create calculator based on choice
    //if choice ==1- add , ==2 - sub , 3 - mul 4-divide

    public int add(int num1, int num2){
        return num1+num2;
    }

    public int sub(int num1, int num2){
        return num1-num2;
    }

    public int multiply(int num1, int num2){
        return num1*num2;
    }

    public int divide(int num1, int num2){
        return num1/num2;
    }


    public static void main(String[] args) {

        Choice_Calculator obj = new Choice_Calculator();
        int operationChoice= 3;

        int result;

        switch (operationChoice){
            case 1:
                result=obj.add(23,45);
                System.out.println("Result of Addtion.."+result);
                break;

            case 2:
                result =obj.sub(43,35);
                System.out.println("Result of Subtraction.."+result);
                break;

            case 3:
                result=obj.multiply(34,76);
                System.out.println("Result of Multiplication..."+result);
                break;

            case 4:
                result = obj.divide(34,17);
                System.out.println("Result of Division.."+result);
                break;


            default:
                System.out.println("Invalid operation Choice...");

        }


    }

}
