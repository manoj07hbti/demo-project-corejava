package class_object_method.method_returntype;

public class Factorial_ReturnMethod {

    public int factorial(int num){
        int factorial =1;
        for (int i=num;i>0;i--) {
            factorial *= i;
        }
            return factorial;
    }


    public static void main(String[] args) {
        Factorial_ReturnMethod num = new Factorial_ReturnMethod();


        //
        int factor= num.factorial(8);
        System.out.println("Factorial of given Number..."+factor);

        factor= num.factorial(11);
        System.out.println("Factorial of given Number..."+factor);
    }
}
