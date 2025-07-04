package method.assignment;

public class Calculator {
 public int add (int a, int b) {
     return a + b;
 }
 public int sub (int a, int b){
     return a-b;
     }
 public int mult (int a, int b) {
     return a * b;
 }
 public double div (int a, int b){
     if (b==0){
         System.out.println("Error Number cannot divide by zero");
         return 0;
     }else{
         return (double) a/b;
     }
         }

    public static void main(String[] args) {
     Calculator obj = new Calculator();
     int a =80;
     int b =2;
     int choice=2;
     if(choice==1){
         System.out.println("Addition of numbers--> " + obj.add(a,b));
     }
     else if(choice==2){
     System.out.println("Subtraction of numbers--> " + obj.sub(a,b));
     }

    }
}
