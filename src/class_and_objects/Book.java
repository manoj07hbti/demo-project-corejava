package class_and_objects;

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
    //sale




    public static void main(String[] args) {

        //ClassName objName= new ClassName();

        Book obj1= new Book();// we have created obj1 as object of Book
        Book obj2= new Book();

        //object.propertyName;
        System.out.println("Name of Object one is : "+obj1.name);
        System.out.println("Page of Object one is : "+obj1.pages);
        System.out.println("Writer of Object one is : "+obj1.writerName);

        System.out.println("Object Two Name: "+obj2.name+ " Pages: "+obj2.pages +" Writer Name: "+obj2.writerName);

    }



}
