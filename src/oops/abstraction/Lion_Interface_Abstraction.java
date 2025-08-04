package oops.abstraction;

public class Lion_Interface_Abstraction implements Demo_Interface{
    @Override
    public void makeSound() {
        System.out.println("Lion roars!");
    }

    @Override
    public void eat() {
        System.out.println("Lion eats meat.");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps in the den.");
    }

    public static void main(String[] args) {
        Lion_Interface_Abstraction obj = new Lion_Interface_Abstraction();
        obj.makeSound();
        obj.eat();
        obj.sleep();
    }
}
