package oops.polymorphism;


public class DemoParent {

    protected void m1(){
        System.out.println("This is my m1 from Parent class...");
    }

    public static void main(String[] args) {

        DemoParent obj= new DemoParent();
        obj.m1();
    }
}
