package oops.inheritance;

public class Dog_ extends DemoInheritanceAnimal {

    public static void main(String[] args) {
        Dog_ obj = new Dog_();
        obj.eat();
        obj.drink();
    }

    @Override
    public void eat() {
        System.out.println("THis is Updated Method");
    }
}
