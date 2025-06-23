package methods.retrun_type;

public class DemoReturnType {

    // create a method which will give welcome message to Java programmer
    //Syntax : access_specifier return_type  method_name (Datatype var...) {CODE..}
    public String message(String name){
        String welcomeMessage="Welcome to Java Programming "+name;

        return welcomeMessage;
    }

    //write a code to make sum of two number
    public int add(int a, int b){
        int sum=a+b;
        return  sum;
    }

    public double divide(int a, int b){

        return  (double) a/b;
    }

    public static void main(String[] args) {
        DemoReturnType obj= new DemoReturnType();
        String output= obj.message("Raj");
        System.out.println("Method output is "+output);
        output= obj.message("Rahul");
        System.out.println("Method output is "+output);

        int sum= obj.add(34,78);
        System.out.println("Sum is "+sum);
        double div= obj.divide(34,5);
        System.out.println("Division is "+div);
    }

}