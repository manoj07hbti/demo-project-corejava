package oops.inheritance;

public class Dog  extends DemoInheritanceAnimal{

    public void bark(){
        System.out.println("This dog can bark");
    }


    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
        obj.runs();
    }

    @Override
    public void eat() {

    }
}
