package Methods.InputParameters;

public class Third_Assignment {

    public void add(int a, int b){
        System.out.println("Addition is "+(a+b));
    }
    public void sub(int a, int b){
        System.out.println("Subtraction is "+(a-b));
    }
    public void div(int a, int b){
        System.out.println("Divide is "+(a/b));
    }
    public void Multi(int a, int b){
        System.out.println("Multiplication is "+(a*b));
    }

    public static void main(String[] args) {
        Third_Assignment obj = new Third_Assignment();

        obj.add(2,5);
        obj.add(4,8);
        obj.add(9,7);
        obj.sub(7,5);
        obj.sub(4,8);
        obj.sub(9,7);
        obj.Multi(2,5);
        obj.Multi(4,8);
        obj.Multi(9,7);
        obj.div(12,5);
        obj.div(4,8);
        obj.div(9,7);
    }
}
