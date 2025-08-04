package oops.polymorphism.methodoverriding;

public class Demo_Bike extends Demo_Vehicle_MethodOverriding {

    public void run() {
        System.out.println("Vehicle is running");
    }

    public static void main(String[] args) {
        Demo_Bike obj =new Demo_Bike();
        obj.run();
    }
}
