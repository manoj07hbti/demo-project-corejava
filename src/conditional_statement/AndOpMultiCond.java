package conditional_statement;

public class AndOpMultiCond {
    public static void main(String[] args) {

       // checking either AQI or city should we good

        String city="jammu";
        int aqi=150;
        if(city=="jammu" && aqi<=150 ){
            System.out.println("Acceptd: " +city + aqi);
        }else{
            System.out.println("Not accepted: " +city + aqi);
        }

        aqi=130;
        if(city=="jammu" && aqi<=150){
            System.out.println("Accepeted: "+city + aqi);
        }else {
            System.out.println("Not accepted: " +city + aqi);
        }

        city="Delhi";
        if(city=="jammu" && aqi<=150){
            System.out.println("accepted: " +city + aqi);
        }else {
            System.out.println("Not accepted: " +city + aqi);
        }

        aqi=300;
        if(city=="jammu" && aqi<=150){
            System.out.println("Accepted: "+city +aqi);
        }else{
            System.out.println("Not accepted: " +city +aqi);


        }
    }
}
