package class_object_practice;

public class Mobile_Class {

    // Describe Properties of Mobile Phone
    String brand;
    String model;
    double screenSize; // in inches
    int storageCapacity; // in GB
    int batteryCapacity; // in mAh
    boolean is5GEnabled;

    // Parameter Constructor


    public Mobile_Class(String brand, String model, double screenSize, int storageCapacity, int batteryCapacity, boolean is5GEnabled) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
        this.batteryCapacity = batteryCapacity;
        this.is5GEnabled = is5GEnabled;
    }


    public static void main(String[] args) {

        Mobile_Class mob1 = new Mobile_Class("Apple","11 Plus",6.22,128,4800,true);
        Mobile_Class mob2 = new Mobile_Class("Apple","5s",4.5,64,2500,false);
        Mobile_Class mob3 = new Mobile_Class("Samsung","s25",6.7,256,6000,true);


        System.out.println("Brand Name : "+mob1.brand+" ; Model : "+mob1.model+" ; Screen Size : "+mob1.screenSize+" ; ");


    }
}
