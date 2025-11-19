package important_keywords;

public class FinalWithMethod {

    //2. method : no one can override/change final methods

    public final void m1(){
        System.out.println("Hello...");
    }

    public final void m1(String name){
        final int age=21;
        System.out.println("Hello..."+age);
      //  age=23;
    }

}
