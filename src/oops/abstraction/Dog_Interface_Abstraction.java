package oops.abstraction;

public  class Dog_Interface_Abstraction implements Demo_Interface{


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

    public static void main(String[] args) {
        Dog_Interface_Abstraction obj=new Dog_Interface_Abstraction();
        obj.makeSound();
        obj.eat();
        obj.sleep();
    }
}
