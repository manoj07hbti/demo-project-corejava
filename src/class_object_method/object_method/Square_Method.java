package class_object_method.object_method;

public class Square_Method {

    // write a method which will tell square of given number

    public void square() {

        int a = 56;

        System.out.println("Square of Given number is..." + (a * a));
    }

    public static void main(String[] args) {

        Square_Method obj = new Square_Method();
        obj.square();
    }
}

