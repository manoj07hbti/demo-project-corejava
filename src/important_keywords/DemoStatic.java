package important_keywords;

public class DemoStatic {

    String name="Java";//non static data
    static int age=21; // static data

    public static void hello(){
        System.out.println("Hello, I am static method...");
    }

    public static void hello(String name){

        System.out.println("Hello, I am static method...");
    }

    public static void main(String[] args) {

        //  ClassName.methodName();
        DemoStatic.hello();
    }

    //Q.1: Can we override static method ?
    //Yes, we can write code for override but we can not achieve overiding (runtime polymorphism will not happen
    //because we are not creating any object.)

    //Q.2: Can we overload static method ?-Yes , overloading is fully supported
    //Q.3: Can we use non static data inside a static method ?
    //
    //non static data: Any data or variable which is not declared as static
    //NO , we can not use as non static data as it will get initialized only when object is created but for static method we do not create object to call it.
}
