package oops.polymorphism;

public class Child extends DemoParent{

    @Override
    public void m1(){
        System.out.println("This is my m1 from Child class...");
    }


    public static void main(String[] args) {
        DemoParent obj= new DemoParent();
        obj.m1(); // parent m1
        obj= new Child();
        obj.m1();// child
       /* Child obj1= new Parent();
        obj.m1(); // */

    }
}
