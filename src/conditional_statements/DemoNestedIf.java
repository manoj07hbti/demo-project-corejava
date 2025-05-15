package conditional_statements;

public class DemoNestedIf {
    public static void main(String[] args) {

        //Question 1
        int num=-14;
        if (num>0){
            if (num%5==0){
                System.out.println(num+" is divisible by 5");
            }else{
                System.out.println(num+" is not divisible by 5");
            }
        }else{
            System.out.println(num+" is less than 0");
        }
        //Question 2
        int num1=-9;
        if (num1>0){
            if (num1%2==0){
                System.out.println(num1 + " is a even number");
            }else{
                System.out.println(num1 + " is a odd number");
            }
        }else{
            System.out.println("enter the number which is greater than zero");
        }


    }
}
