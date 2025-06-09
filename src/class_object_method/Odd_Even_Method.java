package class_object_method;

public class Odd_Even_Method {

    //write a method which can tell number is even or odd

    public void oddEven(){

        int num=19;

        if (num%2 ==0){
            System.out.println("Given Number is Even");
        }else {
            System.out.println("Given Number is Odd");
        }
    }

    public static void main(String[] args) {

        Odd_Even_Method obj1 =new Odd_Even_Method();
        obj1.oddEven();
    }
}
