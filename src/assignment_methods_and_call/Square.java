package assignment_methods_and_call;

public class Square {

    //write a method which will tell square of given number
    public void square(){
        int a=5;
        int square=a*a;
        System.out.println("square of 5 is:"+square);
    }

    public static void main(String[] args) {
        Square obj=new Square();
        obj.square();
    }

}
