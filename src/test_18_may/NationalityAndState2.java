package test_18_may;

public class NationalityAndState2 {
    public static void main(String[] args) {

// // write a code to check person nationality ,
//// if nationality is India then check state should be Maharashtra then print both Nationality and state

        String country= "india";
        String state= "maharashtra";

        if (country== "india"){
         if (state== "maharashtra"){

             System.out.println("person nationalty is "+country+ " and state is "+state);
         }else{
             System.out.println("person nationalty is not"+country+ " and state is also not "+state);
         }

        }
    }
}

