package methods;

public class D1_book {

    //properties or data member
    String name ;
    int pages ;
    String writerName ;
    //todo why we used these properties


    // behaviour or functionalities
    //Syntax : access_specifier return_type  method_name (parameter) {CODE..}
    public void additionMethod(){
        int a=23;
        int b=2;
        int sum= a+b;
        System.out.println("sum of a+b: " + sum );
    }

    public void subtraction(){
        int a = 32 ;
        int b = 3 ;
        int subtraction = a-b;
        System.out.println("subtraction of (a-b):" + subtraction);
    }

    public void multiplication (){
        int a = 22;
        int b = 4;
        int  multiplication = a*b;
        System.out.println(" multiplication of a*b: " +  multiplication);
    }

    public static void main(String[] args) {
        //ClassName objName= new ClassName();
        //STEP 1 : We have create an Object of Class...

        D1_book obj1 = new D1_book();// we have created obj1 as object of Book
        //STEP 2: Calling a method ...
        obj1.additionMethod();
        obj1.subtraction();
        obj1.multiplication();

    }
}

