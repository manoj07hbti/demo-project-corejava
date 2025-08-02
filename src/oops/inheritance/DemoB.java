package oops.inheritance;


public class DemoB extends DemoA {

    public void m4(){
        System.out.println("This is m4 of Child class DemoB");
    }

    public static void main(String[] args) {

        DemoB obj= new DemoB();

        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();

    }
}
