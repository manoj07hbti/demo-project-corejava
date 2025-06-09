package methods;

public class MethodDay2 {

    // write method make addition of number
   // Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    public void addition(){

        int a=23;
        int b=43;
        int sum=a+b;

        System.out.println("Sum of a and b is :"+sum);
    }

    //write a method for cube (number*number*number)

    public void cube(){
        int number=3;
        System.out.println("Cube of given number i s :"+number*number*number);
    }

    public static void main(String[] args) {

        MethodDay2 obj= new MethodDay2();
        obj.addition();
        obj.cube();
    }



}
