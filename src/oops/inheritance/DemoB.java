package oops.inheritance;

public class DemoB extends DemoA {

    public void m4(){
        System.out.println("I am method 4 of Child class B");
    }
    public static void main(String[] args) {

        DemoB obj = new DemoB();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
