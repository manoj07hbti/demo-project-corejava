package important_keywords;

public class Child extends DemoStatic{

    public static void hello(){
        System.out.println("Hello, I am CHILD static method...");
    }

    public static void main(String[] args) {
        Child.hello();
    }
}
