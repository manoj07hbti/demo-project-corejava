package test_18_may;

public class NationalityAndState {

    public static void main(String[] args) {

// write a code to check person nationality ,
// if nationality is India then check state should be Maharashtra then print both Nationality and state

        String country= "India";
        String state ="Maharashtra";

        if (country== "India")
        if (state== "maharashtra") {
            System.out.println("person nationality is "+country+ "and state is "+state);
        }else{
            System.out.println("person nationality is "+country+ " and state is "+state);

// and if person is from different nation it should print that as well in else part.

        }else{
            System.out.println("person nationality is not "+country +"and state is not "+state);

        }

        }

    }








