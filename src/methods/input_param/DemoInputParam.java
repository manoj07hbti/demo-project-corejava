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
        obj.add(7,24);
        obj.add(76,44);
        obj.add(89,47);

        obj.message("vishal");
        obj.message("Neeraj");
    }

    }


