package methods;

public class Book {

    //properties or data member
    String name ;
    int pages ;
    String writerName ;

    // behaviour or functionalities
    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}

    //read
    public void readMethod(){

        System.out.println("This is my read method...");
    }

    //buy
    public void buy(){

        System.out.println("This is buy method...");
    }

    //sale
    public void sale(){
        System.out.println("This is Sale Method");
    }
    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public static void main(String[] args) {

        //ClassName objName= new ClassName();
        //STEP 1 : We have create an Object of Class...
        Book obj1= new Book();// we have created obj1 as object of Book
        //STEP 2: Calling a method ...
        obj1.readMethod();
        obj1.buy();
        obj1.sale();
    }



}
