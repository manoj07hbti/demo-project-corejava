package oops.polymorphism;

public class MethodOverLoading {

  public void m1(){
      System.out.println("This is m1 method...");
  }
 //we have overloaded m1 method with one String parameter...
  public void m1(String name){
      System.out.println("We have overloaded m1 method with one String parameter..."+name);
  }
    public void m1(String name,int age){
        System.out.println("We have overloaded m1 method with two  parameter..."+name+age);
    }

    public void m1(int age){
        System.out.println("We have overloaded m1 method with one String parameter..."+age);
    }


    public static void main(String[] args) {

      MethodOverLoading obj= new MethodOverLoading();
      obj.m1();
      obj.m1(33);
      obj.m1("Hello");
      obj.m1("Hello",123);

    }

}
