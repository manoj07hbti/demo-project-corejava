package class_and_objects.param_constructor;

public class Book {

    String name;
    int pages;
    String writerName;

    //parameterized constructor
    //this points to current object
    public Book(String name, int pages, String writerName) {
        this.name = name;
        this.pages = pages;
        this.writerName = writerName;
    }

    public static void main(String[] args) {

    Book obj1= new Book("Java",232,"James");
    Book obj2= new Book("Matha",543,"RD Sharma");

    System.out.println("Object One Name: "+obj1.name+ " Pages: "+obj1.pages +" Writer Name: "+obj1.writerName);
    System.out.println("Object Two Name: "+obj2.name+ " Pages: "+obj2.pages +" Writer Name: "+obj2.writerName);


    }
}
