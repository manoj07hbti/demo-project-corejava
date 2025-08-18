package exception;

public class DemoException {

   public int divide(int a, int b){

       System.out.println("starting divide");
       int result= 0;
       try {
           result = a/b;
       }
       catch (ArithmeticException e){
           System.out.println("Exception...."+e);
       }
       catch (RuntimeException e) {
           System.out.println("Exception occurred "+e);;
       }
       catch (Exception e) {
           System.out.println("Exception occurred "+e);;
       }
       finally {
           System.out.println("This is finally block, it will always gets executed...");
       }
       System.out.println("after divide");
       return result;
   }

   public void display(){
       System.out.println("before display...");
       int []arr={2,4,5};

       try {
           System.out.println( arr[2]);
       } catch (Exception e) {
           System.out.println("Exception -----"+e);
       }
       finally {
           System.out.println("This is finally block, it will always gets executed...");
       }
       System.out.println("after display...");
   }


    public static void main(String[] args) {

       DemoException obj = new DemoException();
       System.out.println(obj.divide(6,2));
       obj.display();


    }
}
