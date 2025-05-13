package conditional_statements;

public class DemoIfAndElse {

    public static void main(String[] args) {

        //  write a code to check any number is greater than zero or less than zero
        int number=0;
       if(number>0){
           System.out.println("Given Number is greater than Zero :"+number);
       }else {
           System.out.println("Given Number is not greater than Zero :"+number);
       }
      // write a code to check if a Person's city is Pune or not
        String city="Delhi";
       if(city=="Pune"){
           System.out.println("City is Pune...");
       }else {
           System.out.println("City is not Pune...");
       }

        // write a code to check if a product price is costly (>=5000) and not costly if less than 5K

        double price=1212.12;
       if(price>=5000){
           System.out.println("Product is costly ...");
       } else {
           System.out.println("Product is not Costly...");
       }

    }
}
