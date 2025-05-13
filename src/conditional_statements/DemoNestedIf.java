package conditional_statements;

public class DemoNestedIf {
    public static void main(String[] args) {

        //Nested If : if statement inside another if statement
        // write a code to check number is divisible by 3 or not only if number is greater than zero

        int number=17;

        if(number>0){

            if(number%3 ==0){
                System.out.println("Number is divisible by 3 ..."+number);
            }else {
                System.out.println("Number is not divisible by 3..."+number);
            }
        } else {

            System.out.println("Number is not greater than Zero..."+number);
        }



    }
}
