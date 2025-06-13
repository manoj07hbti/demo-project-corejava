package param;

public class Param_Cube {

    public void cube(int a){

        int number = a;
        System.out.println(" cube of given number is= "+number*number*number);

    }
    public static void main(String[] args) {
        Param_Cube obj= new Param_Cube();
        obj.cube(12);
        obj.cube(15);
        obj.cube(8);
    }
}
