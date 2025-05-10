package conditional_statements;

public class DemoIf {

    public static void main(String[] args) {
        /* SYNTAX :  if(condition){
                            CODE
                        }
           */

       //  write a code to check any number is greater than zero
        int number=1;
        if(number>0) {
            System.out.println("Number is greater than Zero..."+number);
        }
        // write a code to check any number is less than zero

        if(number<0){
            System.out.println("Number is less than Zero..."+number);
        }
       // write a code to check if a Person's city is Pune
       String city="Delhi";
        if(city=="Pune"){
            System.out.println("Person city is Pune..."+city);
        }

        // write a code to check if a Person's city is not Pune

        if(city != "Pune"){
            System.out.println("Person's city is not Pune "+city);
        }

        // write a code to check if a product price is costly (>=5000)
        double price=3544.56;

        if(price>=5000){
            System.out.println("Product is costly..."+price);
        }

        // write a code to check if a product price is Not costly (<5000)
        if(price<5000){
            System.out.println("Product is not costly..."+price);
        }
    }
}
