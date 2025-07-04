package method.return_type;


public class DemoReturnType {
    public int add (int a , int b){
        int sum = a + b;
       return sum;
    }
    public String message (String name){
        String helloMessage = "Hello in Java " + name + "!!!";
        return helloMessage;

    }

    public static void main(String[] args) {

        DemoReturnType obj = new DemoReturnType();
       int sum = obj.add(3, 4);
        System.out.println("Sum is " + sum);
        int sum1 = obj.add(47, 55);
        System.out.println("Sum is " + sum1);

        String wlcm= obj.message("Harish");
        System.out.println("It is your first time, " + wlcm);


    }
}
