package method.input_param;

public class DemoInputParam {

    public void add (int a , int b){
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }

    public static void main(String[] args) {

        DemoInputParam obj = new DemoInputParam();
        obj.add(3, 4);
        obj.add(47, 55);





    }
}
