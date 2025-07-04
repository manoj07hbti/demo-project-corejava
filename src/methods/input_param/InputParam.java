package methods.input_param;

public class InputParam {

    public void add(int a,int b){
       int sum=a+b;
        System.out.println("addition of a and b------->"+sum);

    }

   public void message(String name){

       System.out.println("Welcome dear----->"+name);
   }

    public static void main(String[] args) {
          InputParam obj=new InputParam();
       obj.add(2,7);
       obj.add(22,61);
       obj.add(13,31);

       obj.message("rohan");
       obj.message("amit");
       obj.message("anuj");
    }


}
