package oops.abstraction;

public  class Dog_Interface_Abstraction extends Demo implements Demo_Interface{


    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bones.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void m1() {
        System.out.println("This is M1 Method from Demo");
    }

    @Override
    public void m2() {
        System.out.println("This is M2 Method from Demo");
    }

    @Override
    public void m3() {
        System.out.println("This is M3 Method from Demo");
    }

    public static void main(String[] args) {
        Dog_Interface_Abstraction obj=new Dog_Interface_Abstraction();
        obj.makeSound();
        obj.eat();
        obj.sleep();
        obj.m1();
        obj.m2();
        obj.m3();
    }


}
