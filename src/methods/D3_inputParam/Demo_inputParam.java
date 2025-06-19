package methods.D3_inputParam;
public class Demo_inputParam {

    public void message ( String name ){
        System.out.println(" Welcome to programming class for inputParam: " + name);
    }

    public void add ( int a ,int b ){
        int add = a+b;
        System.out.println( "Addition of given number is: " + add);
    }

    public void multiplication ( int a , int b ){
        int multiplication = a*b ;
        System.out.println("multiplication of given number is : " + multiplication);
    }

    public static void main(String[] args) {

        Demo_inputParam obj = new Demo_inputParam();

        obj.add( 2,4);
        obj.add(43,54);
        obj.add(341,324423);

        obj.multiplication(34,53);
        obj.multiplication(33,11);
        obj.multiplication(765,654);

        obj.message(" Rohit ");
        obj.message("Akash");
        obj.message("Ajay");

    }










}
