package test_18_may;

public class CheckNationalityState {
    public static void main(String[] args) {
        //write a code to check person nationality
        String countryName="India";
        String stateName="Maharashtra";

        if (countryName=="India"){
            if (stateName=="Maharashtra"){
                System.out.println("Person nationality is "+countryName+" and State is "+stateName);
            }else{
                System.out.println("Person nationality is "+countryName+" and State is "+stateName);
            }
        }else{
            System.out.println("Person Nationality is not "+countryName);
        }

    }
}
