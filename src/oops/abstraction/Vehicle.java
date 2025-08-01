package oops.abstraction;
//Abstraction 66%
//Abstract class provide partial abstraction as it may have normal method as well.
public abstract class Vehicle {
    public void displayOwnerInfo(){
        System.out.println("Display owner details...");
    }
    public abstract void repairEngine();
    public abstract void service();

    public static void main(String[] args) {
//TODO can we  create object of Abstract ? NO-if we are able to create object of Abstract class then we will have access to call abstract method as well but abstract method do not have any code so jvm will not be able to execute anything so due to this behaviour it is not allowed to create object of Abstract class.

        /*Vehicle obj= new Vehicle();
        obj.service();
        obj.repairEngine();
        obj.displayOwnerInfo();*/
    }

}
