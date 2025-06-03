package class_and_object;

public class Book {

    //properties or data member
    String name = "Java";
    int pages = 457;
    String writerName = "Games Gosling";

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
