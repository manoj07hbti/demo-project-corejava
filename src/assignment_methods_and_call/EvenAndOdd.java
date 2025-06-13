package assignment_methods_and_call;

public class EvenAndOdd {

    //write a method which can tell number is even or odd
    public void evenAndOdd(){
        int number=10;
        int a=2;
        if (number%a==0){
            System.out.println("given number is even");
        }else {
            System.out.println("given number is odd");
        }
    }
    // write a code to find even number between 1 to 100
    public void even(){
        int number=2;
        for (int i=1; i<=50; i++){
            System.out.println(number*i);
        }
    }
    // write a code to find odd number between 1 to 100
    public void odd(){
        int number=2;
        for (int j=1; j<=50; j++ ){
            System.out.println(number*j-1);
        }
    }


    public static void main(String[] args) {
        EvenAndOdd obj=new EvenAndOdd();
        obj.evenAndOdd();
        obj.even();
        obj.odd();
    }
}
