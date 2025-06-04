package object_and_class;

public class HomeClass {


    String address= "House no 180 ";
    String landmark= "near metro mall";
    String colour= "White & Pink";
    String gateColour= "White";
    String rooms= "4 Rooms";
    int sqft= 1011;

    public static void main(String[] args) {

        HomeClass obj1= new HomeClass();

        System.out.println("House address= "+obj1.address);
        System.out.println("landmark= "+obj1.landmark);
        System.out.println("House Colour= "+obj1.colour);
        System.out.println("House gate colour= "+obj1.gateColour);
        System.out.println("House rooms= "+obj1.rooms);
        System.out.println("House land in sqft= "+obj1.sqft+" sqft");

    }
}
