package oops.abstraction;

public class Cat extends Demo_Abstraction_Animal{

    @Override
    public void makeSound() {
        System.out.println("meows");
    }

    public static void main(String[] args) {
        Cat obj = new Cat();
        obj.makeSound();
        obj.sleep();
    }
}
