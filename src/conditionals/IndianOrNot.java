package conditionals;

public class IndianOrNot {

    public static void main(String[] args) {

        String name= "tarun";
        String country= "England";

//if candidate is from INDIA then print INDIAN.

        if (country =="india"){

            System.out.println(name +" is an indian");
        }

//if candidate is not from INDIA then print NON INDIAN.

        if (country !="england"){
            System.out.println(name+" is not an indian because he is from "+country);

        }

    }

    }
