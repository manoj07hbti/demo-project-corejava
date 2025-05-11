package Conditional_Statement;

/*
if candidate is from INDIA then print INDIAN.
if candidate is not from INDIA then print NON INDIAN.
 */
public class Citizenship {
    public static void main(String[] args) {

        String Country = "INDIA";

        if(Country == "INDIA"){
            System.out.println("INDIAN");
        }
        if(Country != "INDIA") {
            System.out.println("NON INDIAN");
        }
    }
}
