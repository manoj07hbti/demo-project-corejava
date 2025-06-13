package class_object_method.method_input_parameter;

public class Cube_Method_Parameter {

    //- wrtie a method for cube of any given number

    public void cube(int a){

        int cube=a*a*a;

        System.out.println("Cube of a number.."+cube);

    }

    //2- write a method to check if given Prime number is prime or not



    public static void main(String[] args) {

        Cube_Method_Parameter obj = new Cube_Method_Parameter();
        obj.cube(32);
        obj.cube(87);
        obj.cube(54);
        obj.cube(2);


    }
}
