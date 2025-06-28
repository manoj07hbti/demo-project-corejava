package methods.input_param;

public class DemoInputParam {


    public void message(String name){

        System.out.println("Welcome to java Programming..."+name);
    }

    //Syntax: access_specifier return_type method_name (parameter) {CODE..}

    public void add(int a, int b ){

        int sum=a+b;

        System.out.println("Sum is ---->"+sum);
    }


    public static void main(String[] args) {

        DemoInputParam obj= new DemoInputParam();
        obj.add(3,6);
        obj.add(23,34);
        obj.add(24,33);

        obj.message("Rahul");
        obj.message("Mohit");
    }

}
